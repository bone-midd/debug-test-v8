-- main - Database Schema for debug-test-v8
-- Created: $(date)

-- Users table
CREATE TABLE IF NOT EXISTS users (
    id SERIAL PRIMARY KEY,
    username VARCHAR(50) UNIQUE NOT NULL,
    email VARCHAR(100) UNIQUE NOT NULL,
    password_hash VARCHAR(255) NOT NULL,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

-- Posts table
CREATE TABLE IF NOT EXISTS posts (
    id SERIAL PRIMARY KEY,
    user_id INTEGER REFERENCES users(id),
    title VARCHAR(200) NOT NULL,
    content TEXT,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

-- Indexes for better performance
CREATE INDEX IF NOT EXISTS idx_users_email ON users(email);
CREATE INDEX IF NOT EXISTS idx_posts_user_id ON posts(user_id);
CREATE INDEX IF NOT EXISTS idx_posts_created_at ON posts(created_at);

-- Sample data insertion
INSERT INTO users (username, email, password_hash) VALUES
('john_doe', 'john@example.com', 'hashed_password_123'),
('jane_smith', 'jane@example.com', 'hashed_password_456');

INSERT INTO posts (user_id, title, content) VALUES
(1, 'First Post', 'This is the content of the first post.'),
(2, 'Welcome Post', 'Welcome to our application!');

-- Useful queries
-- Get all posts with user information
SELECT
    p.title,
    p.content,
    p.created_at,
    u.username
FROM posts p
JOIN users u ON p.user_id = u.id
ORDER BY p.created_at DESC;

-- Get user post count
SELECT
    u.username,
    COUNT(p.id) as post_count
FROM users u
LEFT JOIN posts p ON u.id = p.user_id
GROUP BY u.id, u.username;

# Code Update 1760399129-21563

# Additional Implementation 1760399129

# Code Update 1760399129-31199

# Code Update 1760399129-28477

# Code Update 1760399129-1826

# Code Update 1760399130-23690

# Additional Implementation 1760399130

# Code Update 1760399130-5792

# Additional Implementation 1760399130

# Additional Implementation 1760399130

# Additional Implementation 1760399130

# Code Update 1760399130-13875

# Code Update 1760399130-21772

# Additional Implementation 1760399130

# Additional Implementation 1760399130

# Code Update 1760399130-16809

# Code Update 1760399130-27160

# Code Update 1760399130-7450

# Code Update 1760399131-20616

# Code Update 1760399131-21855

# Additional Implementation 1760399131

# Code Update 1760399131-9768

# Additional Implementation 1760399131

# Code Update 1760399131-11873

# Code Update 1760399131-24046

# Code Update 1760399131-11786

# Code Update 1760399131-5844

# Additional Implementation 1760399131

# Code Update 1760399131-131

# Additional Implementation 1760399132

# Additional Implementation 1760399132

# Additional Implementation 1760399132

# Code Update 1760399132-16270

# Additional Implementation 1760399132

# Additional Implementation 1760399132

# Additional Implementation 1760399132

# Code Update 1760399132-8974

# Code Update 1760399132-9472

# Code Update 1760399132-4586

# Code Update 1760399133-10706

# Additional Implementation 1760399133

# Additional Implementation 1760399133

# Code Update 1760399133-29270

# Additional Implementation 1760399133

# Additional Implementation 1760399133

# Code Update 1760399133-15408

# Code Update 1760399133-5095

# Additional Implementation 1760399133

# Additional Implementation 1760399133

# Additional Implementation 1760399134

# Additional Implementation 1760399134

# Additional Implementation 1760399134

# Code Update 1760399134-7497

# PR Merge: 2025-10-14 - fix/merge-9712

# PR Merge: 2025-10-14 - enhancement/merge-9698

# PR Merge: 2025-10-14 - docs/merge-5157

# PR Merge: 2025-10-14 - refactor/merge-8821

// Update: commit #2

// Update: commit #9

// Update: commit #15

// Update: commit #22

// Update: commit #23

// Update: commit #24

// Update: commit #27

// Update: commit #28

// Update: commit #31

// Update: commit #33

// Update: commit #42

// Update: commit #45

// Update: commit #62

// Update: commit #73

// Update: commit #74

// Update: commit #78

// Update: commit #80

// Update: commit #84

// Update: commit #92

// Update: commit #93

// Update: commit #98

// Update: commit #108

// Update: commit #110

// Update: commit #111

// Update: commit #112

// Update: commit #115

// Update: commit #116

// Update: commit #121

// Update: commit #137

// Update: commit #139

// Update: commit #141

// Update: commit #149

// Update: commit #157

// Update: commit #160

// Update: commit #162

// Update: commit #163

// Update: commit #167

// Update: commit #176

// Update: commit #184

// Update: commit #198

// Update: commit #202

// Update: commit #205

// Update: commit #206

// Update: commit #210

// Update: commit #218

// Update: commit #221

// Update: commit #226

// Update: commit #234

// Update: commit #237

// Update: commit #244

// Update: commit #245

// Update: commit #246

// Update: commit #247

// Update: commit #249

// Update: commit #254

// Update: commit #261

// Update: commit #266

// Update: commit #280

// Update: commit #281

// Update: commit #284

// Update: commit #286

// Update: commit #288

// Update: commit #290

// Update: commit #291

// Update: commit #292

// Update: commit #302

// Update: commit #303
