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

# Code Update 1760399129-16767

# Additional Implementation 1760399129

# Additional Implementation 1760399129

# Code Update 1760399129-25622

# Additional Implementation 1760399130

# Code Update 1760399130-3034

# Code Update 1760399130-25620

# Additional Implementation 1760399130

# Code Update 1760399130-22397

# Code Update 1760399130-7561

# Code Update 1760399130-666

# Additional Implementation 1760399130

# Additional Implementation 1760399130

# Additional Implementation 1760399131

# Additional Implementation 1760399131

# Code Update 1760399131-16681

# Code Update 1760399131-20983

# Code Update 1760399131-12936

# Additional Implementation 1760399131

# Code Update 1760399131-5940

# Additional Implementation 1760399131

# Code Update 1760399132-3323

# Additional Implementation 1760399132

# Code Update 1760399132-28878

# Additional Implementation 1760399132

# Additional Implementation 1760399132

# Additional Implementation 1760399132

# Additional Implementation 1760399132

# Additional Implementation 1760399133

# Additional Implementation 1760399133

# Code Update 1760399133-3295

# Additional Implementation 1760399133

# Code Update 1760399133-32161

# Additional Implementation 1760399133

# Code Update 1760399133-27172

# Additional Implementation 1760399133

# Additional Implementation 1760399134

# Code Update 1760399134-13324

# Additional Implementation 1760399134

# Code Update 1760399134-26644

# Additional Implementation 1760399134

# PR Merge: 2025-10-14 - enhancement/merge-7183

# PR Merge: 2025-10-14 - docs/merge-3149

# PR Merge: 2025-10-14 - docs/merge-4916

# PR Merge: 2025-10-14 - fix/merge-8797

// Update: commit #3

// Update: commit #4

// Update: commit #6

// Update: commit #10

// Update: commit #13

// Update: commit #14

// Update: commit #19

// Update: commit #20

// Update: commit #25

// Update: commit #37

// Update: commit #38

// Update: commit #39

// Update: commit #44

// Update: commit #46

// Update: commit #49

// Update: commit #53

// Update: commit #54

// Update: commit #55

// Update: commit #58

// Update: commit #71

// Update: commit #75

// Update: commit #86

// Update: commit #87

// Update: commit #89

// Update: commit #95

// Update: commit #100
