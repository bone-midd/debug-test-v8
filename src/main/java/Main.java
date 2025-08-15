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

// Update: commit #301

// Update: commit #312

// Update: commit #313

// Update: commit #314

// Update: commit #320

// Update: commit #324

// Update: commit #326

// Update: commit #332

// Update: commit #338

// Update: commit #340

// Update: commit #351

// Update: commit #353

// Update: commit #355

// Update: commit #362

// Update: commit #363

// Update: commit #367

// Update: commit #372

// Update: commit #373

// Update: commit #375

// Update: commit #376

// Update: commit #379

// Update: commit #387

// Update: commit #392

// Update: commit #398

// Update: commit #404

// Update: commit #407

// Update: commit #408

// Update: commit #410

// Update: commit #414

// Update: commit #417

// Update: commit #421

// Update: commit #423

// Update: commit #424

// Update: commit #425

// Update: commit #427

// Update: commit #428

// Update: commit #432

// Update: commit #433

// Update: commit #437

// Update: commit #443

// Update: commit #444

// Update: commit #446

// Update: commit #447

// Update: commit #448

// Update: commit #449

// Update: commit #452

// Update: commit #455

// Update: commit #457

// Update: commit #459

// Update: commit #461

// Update: commit #462

// Update: commit #464

// Update: commit #468

// Update: commit #473

// Update: commit #474

// Update: commit #481

// Update: commit #483

// Update: commit #485

// Update: commit #491

// Update: commit #492

// Update: commit #493

// Update: commit #497

// Update: commit #500

// Update: commit #501

// Update: commit #505

// Update: commit #514

// Update: commit #517

// Update: commit #529

// Update: commit #535

// Update: commit #537

// Update: commit #538

// Update: commit #544

// Update: commit #545

// Update: commit #546

// Update: commit #549

// Update: commit #552

// Update: commit #554

// Update: commit #558

// Update: commit #560

// Update: commit #561

// Update: commit #565

// Update: commit #566

// Update: commit #568

// Update: commit #569

// Update: commit #572

// Update: commit #578

// Update: commit #580

// Update: commit #581

// Update: commit #584

// Update: commit #586

// Update: commit #590

// Update: commit #591

// Update: commit #595

// Update: commit #597

// Update: commit #600

// Update: commit #601

// Update: commit #602

// Update: commit #606

// Update: commit #609

// Update: commit #619

// Update: commit #621

// Update: commit #632

// Update: commit #638

// Update: commit #639

// Update: commit #644

// Update: commit #651

// Update: commit #653

// Update: commit #654

// Update: commit #658

// Update: commit #663

// Update: commit #673

// Update: commit #678

// Update: commit #679

// Update: commit #685

// Update: commit #687

// Update: commit #690

// Update: commit #691

// Update: commit #692

// Update: commit #695

// Update: commit #698

// Update: commit #700

// Update: commit #707

// Update: commit #709

// Update: commit #710

// Update: commit #713

// Update: commit #714

// Update: commit #716

// Update: commit #721

// Update: commit #728

// Update: commit #735

// Update: commit #737

// Update: commit #739

// Update: commit #742

// Update: commit #745

// Update: commit #747

// Update: commit #748

// Update: commit #752

// Update: commit #754

// Update: commit #755

// Update: commit #758

// Update: commit #762

// Update: commit #763

// Update: commit #766

// Update: commit #768

// Update: commit #770

// Update: commit #776

// Update: commit #778

// Update: commit #780

// Update: commit #784

// Update: commit #790

// Update: commit #791

// Update: commit #794

// Update: commit #799

// Update: commit #800

// Update: commit #804

// Update: commit #805

// Update: commit #807

// Update: commit #808

// Update: commit #809

// Update: commit #811

// Update: commit #816

// Update: commit #828

// Update: commit #829

// Update: commit #836

// Update: commit #838

// Update: commit #840

// Update: commit #842

// Update: commit #843

// Update: commit #853

// Update: commit #857

// Update: commit #858

// Update: commit #859

// Update: commit #863

// Update: commit #868

// Update: commit #870

// Update: commit #873

// Update: commit #874

// Update: commit #880

// Update: commit #882

// Update: commit #884

// Update: commit #888

// Update: commit #889

// Update: commit #892
