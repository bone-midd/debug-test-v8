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

# Additional Implementation 1760399129

# Additional Implementation 1760399129

# Code Update 1760399129-8018

# Code Update 1760399129-5707

# Additional Implementation 1760399129

# Code Update 1760399129-6896

# Additional Implementation 1760399129

# Code Update 1760399129-27873

# Code Update 1760399129-17474

# Code Update 1760399130-30081

# Additional Implementation 1760399130

# Code Update 1760399130-28708

# Additional Implementation 1760399130

# Code Update 1760399130-3738

# Additional Implementation 1760399130

# Additional Implementation 1760399130

# Additional Implementation 1760399131

# Additional Implementation 1760399131

# Code Update 1760399131-5475

# Additional Implementation 1760399131

# Additional Implementation 1760399131

# Additional Implementation 1760399131

# Additional Implementation 1760399131

# Additional Implementation 1760399131

# Additional Implementation 1760399131

# Additional Implementation 1760399131

# Additional Implementation 1760399132

# Code Update 1760399132-21043

# Code Update 1760399132-6644

# Additional Implementation 1760399132

# Code Update 1760399132-27356

# Code Update 1760399132-1647

# Code Update 1760399132-6800

# Code Update 1760399132-24481

# Additional Implementation 1760399132

# Code Update 1760399132-29979

# Code Update 1760399132-8666

# Additional Implementation 1760399132

# Additional Implementation 1760399133

# Additional Implementation 1760399133

# Code Update 1760399133-23784

# Additional Implementation 1760399133

# Additional Implementation 1760399133

# Additional Implementation 1760399133

# Code Update 1760399133-6484

# Additional Implementation 1760399133

# Additional Implementation 1760399133

# Additional Implementation 1760399133

# Additional Implementation 1760399133

# Additional Implementation 1760399134

# Additional Implementation 1760399134

# Code Update 1760399134-12687

# Additional Implementation 1760399134

# Additional Implementation 1760399134

# Additional Implementation 1760399134

# PR Merge: 2025-10-14 - refactor/merge-8175

# PR Merge: 2025-10-14 - refactor/merge-9670

# PR Merge: 2025-10-14 - fix/merge-3005

# PR Merge: 2025-10-14 - fix/merge-6790

// Update: commit #1

// Update: commit #5

// Update: commit #7

// Update: commit #8

// Update: commit #12

// Update: commit #16

// Update: commit #17

// Update: commit #18

// Update: commit #21

// Update: commit #29

// Update: commit #30

// Update: commit #34

// Update: commit #36

// Update: commit #57

// Update: commit #59

// Update: commit #64

// Update: commit #66

// Update: commit #67

// Update: commit #70

// Update: commit #72

// Update: commit #77

// Update: commit #79

// Update: commit #83

// Update: commit #90

// Update: commit #94

// Update: commit #96

// Update: commit #97

// Update: commit #99

// Update: commit #104

// Update: commit #105

// Update: commit #106

// Update: commit #107

// Update: commit #122

// Update: commit #123

// Update: commit #128

// Update: commit #132

// Update: commit #136

// Update: commit #151

// Update: commit #153

// Update: commit #155

// Update: commit #161

// Update: commit #166

// Update: commit #171

// Update: commit #177

// Update: commit #178

// Update: commit #181

// Update: commit #185

// Update: commit #186

// Update: commit #188

// Update: commit #189

// Update: commit #193

// Update: commit #194

// Update: commit #196

// Update: commit #197

// Update: commit #201

// Update: commit #204

// Update: commit #207

// Update: commit #209

// Update: commit #225

// Update: commit #235

// Update: commit #239

// Update: commit #240

// Update: commit #243

// Update: commit #250

// Update: commit #260

// Update: commit #262

// Update: commit #264

// Update: commit #267

// Update: commit #270

// Update: commit #272

// Update: commit #277

// Update: commit #278

// Update: commit #279

// Update: commit #285
