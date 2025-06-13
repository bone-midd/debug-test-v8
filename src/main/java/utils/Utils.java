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

// Update: commit #101

// Update: commit #102

// Update: commit #103

// Update: commit #113

// Update: commit #118

// Update: commit #119

// Update: commit #124

// Update: commit #125

// Update: commit #129

// Update: commit #131

// Update: commit #133

// Update: commit #135

// Update: commit #138

// Update: commit #140

// Update: commit #142

// Update: commit #143

// Update: commit #146

// Update: commit #148

// Update: commit #150

// Update: commit #154

// Update: commit #156

// Update: commit #165

// Update: commit #168

// Update: commit #169

// Update: commit #170

// Update: commit #172

// Update: commit #173

// Update: commit #179

// Update: commit #180

// Update: commit #183

// Update: commit #187

// Update: commit #190

// Update: commit #192

// Update: commit #199

// Update: commit #208

// Update: commit #211

// Update: commit #212

// Update: commit #213

// Update: commit #216

// Update: commit #217

// Update: commit #219

// Update: commit #220

// Update: commit #222

// Update: commit #224

// Update: commit #227

// Update: commit #229

// Update: commit #230

// Update: commit #231

// Update: commit #232

// Update: commit #236

// Update: commit #242

// Update: commit #251

// Update: commit #256

// Update: commit #263

// Update: commit #269

// Update: commit #274

// Update: commit #275

// Update: commit #276

// Update: commit #297

// Update: commit #298

// Update: commit #307

// Update: commit #308

// Update: commit #316

// Update: commit #322

// Update: commit #328

// Update: commit #329

// Update: commit #331

// Update: commit #339

// Update: commit #342

// Update: commit #344

// Update: commit #347

// Update: commit #364

// Update: commit #365

// Update: commit #371

// Update: commit #374

// Update: commit #377

// Update: commit #380

// Update: commit #390

// Update: commit #396

// Update: commit #397

// Update: commit #399

// Update: commit #403

// Update: commit #409

// Update: commit #411

// Update: commit #412

// Update: commit #422

// Update: commit #430

// Update: commit #438

// Update: commit #440

// Update: commit #441

// Update: commit #442

// Update: commit #456

// Update: commit #465

// Update: commit #469

// Update: commit #470

// Update: commit #486

// Update: commit #488

// Update: commit #495

// Update: commit #496

// Update: commit #506

// Update: commit #507

// Update: commit #508

// Update: commit #509

// Update: commit #516

// Update: commit #519

// Update: commit #524

// Update: commit #526

// Update: commit #527

// Update: commit #530

// Update: commit #531

// Update: commit #534

// Update: commit #547

// Update: commit #550

// Update: commit #555

// Update: commit #563

// Update: commit #573

// Update: commit #574

// Update: commit #579

// Update: commit #588
