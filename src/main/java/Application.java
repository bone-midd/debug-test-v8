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

// Update: commit #304

// Update: commit #305

// Update: commit #311

// Update: commit #315

// Update: commit #317

// Update: commit #327

// Update: commit #333

// Update: commit #335

// Update: commit #343

// Update: commit #354

// Update: commit #356

// Update: commit #357

// Update: commit #358

// Update: commit #359

// Update: commit #360

// Update: commit #369

// Update: commit #370

// Update: commit #381

// Update: commit #383

// Update: commit #385

// Update: commit #386

// Update: commit #391

// Update: commit #394

// Update: commit #395

// Update: commit #400

// Update: commit #405

// Update: commit #413

// Update: commit #426

// Update: commit #429

// Update: commit #431

// Update: commit #435

// Update: commit #436

// Update: commit #439

// Update: commit #450

// Update: commit #453

// Update: commit #454

// Update: commit #458

// Update: commit #471

// Update: commit #475

// Update: commit #479

// Update: commit #480

// Update: commit #489

// Update: commit #498

// Update: commit #502

// Update: commit #503

// Update: commit #510

// Update: commit #512

// Update: commit #513

// Update: commit #518

// Update: commit #521

// Update: commit #523

// Update: commit #532

// Update: commit #533

// Update: commit #539

// Update: commit #548

// Update: commit #553

// Update: commit #556

// Update: commit #559

// Update: commit #564

// Update: commit #570

// Update: commit #571

// Update: commit #582

// Update: commit #583

// Update: commit #587

// Update: commit #594

// Update: commit #596

// Update: commit #614

// Update: commit #615

// Update: commit #617

// Update: commit #618

// Update: commit #622

// Update: commit #623

// Update: commit #624

// Update: commit #631

// Update: commit #641

// Update: commit #643

// Update: commit #648

// Update: commit #662

// Update: commit #665

// Update: commit #666

// Update: commit #667

// Update: commit #670

// Update: commit #676

// Update: commit #682

// Update: commit #697

// Update: commit #702

// Update: commit #703

// Update: commit #704

// Update: commit #708

// Update: commit #723

// Update: commit #724

// Update: commit #726

// Update: commit #729

// Update: commit #731

// Update: commit #732

// Update: commit #733

// Update: commit #736

// Update: commit #749

// Update: commit #759

// Update: commit #760

// Update: commit #764

// Update: commit #765

// Update: commit #767

// Update: commit #769

// Update: commit #771

// Update: commit #772

// Update: commit #775

// Update: commit #789

// Update: commit #795

// Update: commit #802

// Update: commit #803

// Update: commit #806

// Update: commit #812

// Update: commit #813

// Update: commit #817

// Update: commit #821

// Update: commit #823

// Update: commit #824
