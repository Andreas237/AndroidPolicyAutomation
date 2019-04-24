.class public Lcom/huawei/health/sns/storage/db/SNSContentProvider;
.super Landroid/content/ContentProvider;
.source "SourceFile"


# static fields
.field private static final b:[Ljava/lang/String;

.field private static final c:Landroid/content/UriMatcher;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 52
    new-instance v0, Landroid/content/UriMatcher;

    const/4 v1, -0x1

    invoke-direct {v0, v1}, Landroid/content/UriMatcher;-><init>(I)V

    sput-object v0, Lcom/huawei/health/sns/storage/db/SNSContentProvider;->c:Landroid/content/UriMatcher;

    .line 56
    const/16 v0, 0xd

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "t_user"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, "t_user_notify"

    const/4 v2, 0x1

    aput-object v1, v0, v2

    const-string v1, "t_user_notify_note"

    const/4 v2, 0x2

    aput-object v1, v0, v2

    const-string v1, "t_group"

    const/4 v2, 0x3

    aput-object v1, v0, v2

    const-string v1, "t_group_member"

    const/4 v2, 0x4

    aput-object v1, v0, v2

    const-string v1, "t_group_notify"

    const/4 v2, 0x5

    aput-object v1, v0, v2

    const-string v1, "t_message"

    const/4 v2, 0x6

    aput-object v1, v0, v2

    const-string v1, "t_conversation"

    const/4 v2, 0x7

    aput-object v1, v0, v2

    const-string v1, "t_assistant"

    const/16 v2, 0x8

    aput-object v1, v0, v2

    const-string v1, "t_circle_action_param"

    const/16 v2, 0x9

    aput-object v1, v0, v2

    const-string v1, "t_user_circle"

    const/16 v2, 0xa

    aput-object v1, v0, v2

    const-string v1, "t_circle_content"

    const/16 v2, 0xb

    aput-object v1, v0, v2

    const-string v1, "t_setting"

    const/16 v2, 0xc

    aput-object v1, v0, v2

    sput-object v0, Lcom/huawei/health/sns/storage/db/SNSContentProvider;->b:[Ljava/lang/String;

    .line 259
    sget-object v4, Lcom/huawei/health/sns/storage/db/SNSContentProvider;->c:Landroid/content/UriMatcher;

    .line 261
    const-string v0, "com.huawei.health.sns.provider"

    sget-object v1, Lcom/huawei/health/sns/storage/db/SNSContentProvider;->b:[Ljava/lang/String;

    const/4 v2, 0x0

    aget-object v1, v1, v2

    const/4 v2, 0x0

    invoke-virtual {v4, v0, v1, v2}, Landroid/content/UriMatcher;->addURI(Ljava/lang/String;Ljava/lang/String;I)V

    .line 262
    const-string v0, "com.huawei.health.sns.provider"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v2, Lcom/huawei/health/sns/storage/db/SNSContentProvider;->b:[Ljava/lang/String;

    const/4 v3, 0x0

    aget-object v2, v2, v3

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "/#"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0x32

    invoke-virtual {v4, v0, v1, v2}, Landroid/content/UriMatcher;->addURI(Ljava/lang/String;Ljava/lang/String;I)V

    .line 265
    const-string v0, "com.huawei.health.sns.provider"

    sget-object v1, Lcom/huawei/health/sns/storage/db/SNSContentProvider;->b:[Ljava/lang/String;

    const/4 v2, 0x1

    aget-object v1, v1, v2

    const/4 v2, 0x1

    invoke-virtual {v4, v0, v1, v2}, Landroid/content/UriMatcher;->addURI(Ljava/lang/String;Ljava/lang/String;I)V

    .line 267
    const-string v0, "com.huawei.health.sns.provider"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v2, Lcom/huawei/health/sns/storage/db/SNSContentProvider;->b:[Ljava/lang/String;

    const/4 v3, 0x1

    aget-object v2, v2, v3

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "/#"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0x33

    invoke-virtual {v4, v0, v1, v2}, Landroid/content/UriMatcher;->addURI(Ljava/lang/String;Ljava/lang/String;I)V

    .line 270
    const-string v0, "com.huawei.health.sns.provider"

    sget-object v1, Lcom/huawei/health/sns/storage/db/SNSContentProvider;->b:[Ljava/lang/String;

    const/4 v2, 0x2

    aget-object v1, v1, v2

    const/4 v2, 0x2

    invoke-virtual {v4, v0, v1, v2}, Landroid/content/UriMatcher;->addURI(Ljava/lang/String;Ljava/lang/String;I)V

    .line 272
    const-string v0, "com.huawei.health.sns.provider"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v2, Lcom/huawei/health/sns/storage/db/SNSContentProvider;->b:[Ljava/lang/String;

    const/4 v3, 0x2

    aget-object v2, v2, v3

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "/#"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0x34

    invoke-virtual {v4, v0, v1, v2}, Landroid/content/UriMatcher;->addURI(Ljava/lang/String;Ljava/lang/String;I)V

    .line 275
    const-string v0, "com.huawei.health.sns.provider"

    sget-object v1, Lcom/huawei/health/sns/storage/db/SNSContentProvider;->b:[Ljava/lang/String;

    const/4 v2, 0x3

    aget-object v1, v1, v2

    const/4 v2, 0x3

    invoke-virtual {v4, v0, v1, v2}, Landroid/content/UriMatcher;->addURI(Ljava/lang/String;Ljava/lang/String;I)V

    .line 276
    const-string v0, "com.huawei.health.sns.provider"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v2, Lcom/huawei/health/sns/storage/db/SNSContentProvider;->b:[Ljava/lang/String;

    const/4 v3, 0x3

    aget-object v2, v2, v3

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "/#"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0x35

    invoke-virtual {v4, v0, v1, v2}, Landroid/content/UriMatcher;->addURI(Ljava/lang/String;Ljava/lang/String;I)V

    .line 279
    const-string v0, "com.huawei.health.sns.provider"

    sget-object v1, Lcom/huawei/health/sns/storage/db/SNSContentProvider;->b:[Ljava/lang/String;

    const/4 v2, 0x4

    aget-object v1, v1, v2

    const/4 v2, 0x4

    invoke-virtual {v4, v0, v1, v2}, Landroid/content/UriMatcher;->addURI(Ljava/lang/String;Ljava/lang/String;I)V

    .line 281
    const-string v0, "com.huawei.health.sns.provider"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v2, Lcom/huawei/health/sns/storage/db/SNSContentProvider;->b:[Ljava/lang/String;

    const/4 v3, 0x4

    aget-object v2, v2, v3

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "/#"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0x36

    invoke-virtual {v4, v0, v1, v2}, Landroid/content/UriMatcher;->addURI(Ljava/lang/String;Ljava/lang/String;I)V

    .line 284
    const-string v0, "com.huawei.health.sns.provider"

    sget-object v1, Lcom/huawei/health/sns/storage/db/SNSContentProvider;->b:[Ljava/lang/String;

    const/4 v2, 0x5

    aget-object v1, v1, v2

    const/4 v2, 0x5

    invoke-virtual {v4, v0, v1, v2}, Landroid/content/UriMatcher;->addURI(Ljava/lang/String;Ljava/lang/String;I)V

    .line 286
    const-string v0, "com.huawei.health.sns.provider"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v2, Lcom/huawei/health/sns/storage/db/SNSContentProvider;->b:[Ljava/lang/String;

    const/4 v3, 0x5

    aget-object v2, v2, v3

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "/#"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0x37

    invoke-virtual {v4, v0, v1, v2}, Landroid/content/UriMatcher;->addURI(Ljava/lang/String;Ljava/lang/String;I)V

    .line 289
    const-string v0, "com.huawei.health.sns.provider"

    sget-object v1, Lcom/huawei/health/sns/storage/db/SNSContentProvider;->b:[Ljava/lang/String;

    const/4 v2, 0x6

    aget-object v1, v1, v2

    const/4 v2, 0x6

    invoke-virtual {v4, v0, v1, v2}, Landroid/content/UriMatcher;->addURI(Ljava/lang/String;Ljava/lang/String;I)V

    .line 290
    const-string v0, "com.huawei.health.sns.provider"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v2, Lcom/huawei/health/sns/storage/db/SNSContentProvider;->b:[Ljava/lang/String;

    const/4 v3, 0x6

    aget-object v2, v2, v3

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "/#"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0x38

    invoke-virtual {v4, v0, v1, v2}, Landroid/content/UriMatcher;->addURI(Ljava/lang/String;Ljava/lang/String;I)V

    .line 293
    const-string v0, "com.huawei.health.sns.provider"

    sget-object v1, Lcom/huawei/health/sns/storage/db/SNSContentProvider;->b:[Ljava/lang/String;

    const/4 v2, 0x7

    aget-object v1, v1, v2

    const/4 v2, 0x7

    invoke-virtual {v4, v0, v1, v2}, Landroid/content/UriMatcher;->addURI(Ljava/lang/String;Ljava/lang/String;I)V

    .line 295
    const-string v0, "com.huawei.health.sns.provider"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v2, Lcom/huawei/health/sns/storage/db/SNSContentProvider;->b:[Ljava/lang/String;

    const/4 v3, 0x7

    aget-object v2, v2, v3

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "/#"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0x39

    invoke-virtual {v4, v0, v1, v2}, Landroid/content/UriMatcher;->addURI(Ljava/lang/String;Ljava/lang/String;I)V

    .line 298
    const-string v0, "com.huawei.health.sns.provider"

    sget-object v1, Lcom/huawei/health/sns/storage/db/SNSContentProvider;->b:[Ljava/lang/String;

    const/16 v2, 0x8

    aget-object v1, v1, v2

    const/16 v2, 0x8

    invoke-virtual {v4, v0, v1, v2}, Landroid/content/UriMatcher;->addURI(Ljava/lang/String;Ljava/lang/String;I)V

    .line 300
    const-string v0, "com.huawei.health.sns.provider"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v2, Lcom/huawei/health/sns/storage/db/SNSContentProvider;->b:[Ljava/lang/String;

    const/16 v3, 0x8

    aget-object v2, v2, v3

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "/#"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0x3a

    invoke-virtual {v4, v0, v1, v2}, Landroid/content/UriMatcher;->addURI(Ljava/lang/String;Ljava/lang/String;I)V

    .line 303
    const-string v0, "com.huawei.health.sns.provider"

    sget-object v1, Lcom/huawei/health/sns/storage/db/SNSContentProvider;->b:[Ljava/lang/String;

    const/16 v2, 0x9

    aget-object v1, v1, v2

    const/16 v2, 0x9

    invoke-virtual {v4, v0, v1, v2}, Landroid/content/UriMatcher;->addURI(Ljava/lang/String;Ljava/lang/String;I)V

    .line 305
    const-string v0, "com.huawei.health.sns.provider"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v2, Lcom/huawei/health/sns/storage/db/SNSContentProvider;->b:[Ljava/lang/String;

    const/16 v3, 0x9

    aget-object v2, v2, v3

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "/#"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0x3b

    invoke-virtual {v4, v0, v1, v2}, Landroid/content/UriMatcher;->addURI(Ljava/lang/String;Ljava/lang/String;I)V

    .line 308
    const-string v0, "com.huawei.health.sns.provider"

    sget-object v1, Lcom/huawei/health/sns/storage/db/SNSContentProvider;->b:[Ljava/lang/String;

    const/16 v2, 0xa

    aget-object v1, v1, v2

    const/16 v2, 0xa

    invoke-virtual {v4, v0, v1, v2}, Landroid/content/UriMatcher;->addURI(Ljava/lang/String;Ljava/lang/String;I)V

    .line 310
    const-string v0, "com.huawei.health.sns.provider"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v2, Lcom/huawei/health/sns/storage/db/SNSContentProvider;->b:[Ljava/lang/String;

    const/16 v3, 0xa

    aget-object v2, v2, v3

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "/#"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0x3c

    invoke-virtual {v4, v0, v1, v2}, Landroid/content/UriMatcher;->addURI(Ljava/lang/String;Ljava/lang/String;I)V

    .line 313
    const-string v0, "com.huawei.health.sns.provider"

    sget-object v1, Lcom/huawei/health/sns/storage/db/SNSContentProvider;->b:[Ljava/lang/String;

    const/16 v2, 0xb

    aget-object v1, v1, v2

    const/16 v2, 0xb

    invoke-virtual {v4, v0, v1, v2}, Landroid/content/UriMatcher;->addURI(Ljava/lang/String;Ljava/lang/String;I)V

    .line 315
    const-string v0, "com.huawei.health.sns.provider"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v2, Lcom/huawei/health/sns/storage/db/SNSContentProvider;->b:[Ljava/lang/String;

    const/16 v3, 0xb

    aget-object v2, v2, v3

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "/#"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0x3d

    invoke-virtual {v4, v0, v1, v2}, Landroid/content/UriMatcher;->addURI(Ljava/lang/String;Ljava/lang/String;I)V

    .line 318
    const-string v0, "com.huawei.health.sns.provider"

    sget-object v1, Lcom/huawei/health/sns/storage/db/SNSContentProvider;->b:[Ljava/lang/String;

    const/16 v2, 0xc

    aget-object v1, v1, v2

    const/16 v2, 0xc

    invoke-virtual {v4, v0, v1, v2}, Landroid/content/UriMatcher;->addURI(Ljava/lang/String;Ljava/lang/String;I)V

    .line 320
    const-string v0, "com.huawei.health.sns.provider"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v2, Lcom/huawei/health/sns/storage/db/SNSContentProvider;->b:[Ljava/lang/String;

    const/16 v3, 0xc

    aget-object v2, v2, v3

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "/#"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0x3e

    invoke-virtual {v4, v0, v1, v2}, Landroid/content/UriMatcher;->addURI(Ljava/lang/String;Ljava/lang/String;I)V

    .line 324
    const-string v0, "com.huawei.health.sns.provider"

    const-string v1, "group_member_detail"

    const/16 v2, 0x64

    invoke-virtual {v4, v0, v1, v2}, Landroid/content/UriMatcher;->addURI(Ljava/lang/String;Ljava/lang/String;I)V

    .line 328
    const-string v0, "com.huawei.health.sns.provider"

    const-string v1, "user_notify_detail"

    const/16 v2, 0x65

    invoke-virtual {v4, v0, v1, v2}, Landroid/content/UriMatcher;->addURI(Ljava/lang/String;Ljava/lang/String;I)V

    .line 332
    const-string v0, "com.huawei.health.sns.provider"

    const-string v1, "conversation_detail"

    const/16 v2, 0x66

    invoke-virtual {v4, v0, v1, v2}, Landroid/content/UriMatcher;->addURI(Ljava/lang/String;Ljava/lang/String;I)V

    .line 336
    const-string v0, "com.huawei.health.sns.provider"

    const-string v1, "group_notify_detail"

    const/16 v2, 0x67

    invoke-virtual {v4, v0, v1, v2}, Landroid/content/UriMatcher;->addURI(Ljava/lang/String;Ljava/lang/String;I)V

    .line 340
    const-string v0, "com.huawei.health.sns.provider"

    const-string v1, "group_conversation_detail"

    const/16 v2, 0x68

    invoke-virtual {v4, v0, v1, v2}, Landroid/content/UriMatcher;->addURI(Ljava/lang/String;Ljava/lang/String;I)V

    .line 344
    const-string v0, "com.huawei.health.sns.provider"

    const-string v1, "assistant_detail"

    const/16 v2, 0x69

    invoke-virtual {v4, v0, v1, v2}, Landroid/content/UriMatcher;->addURI(Ljava/lang/String;Ljava/lang/String;I)V

    .line 348
    const-string v0, "com.huawei.health.sns.provider"

    const-string v1, "groupmember_group_detail"

    const/16 v2, 0x6a

    invoke-virtual {v4, v0, v1, v2}, Landroid/content/UriMatcher;->addURI(Ljava/lang/String;Ljava/lang/String;I)V

    .line 352
    const-string v0, "com.huawei.health.sns.provider"

    const-string v1, "user_circle_detail"

    const/16 v2, 0x6b

    invoke-virtual {v4, v0, v1, v2}, Landroid/content/UriMatcher;->addURI(Ljava/lang/String;Ljava/lang/String;I)V

    .line 355
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 48
    invoke-direct {p0}, Landroid/content/ContentProvider;-><init>()V

    return-void
.end method

.method private a(Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;)I
    .locals 6

    .line 457
    sget-object v0, Lcom/huawei/health/sns/storage/db/SNSContentProvider;->c:Landroid/content/UriMatcher;

    invoke-virtual {v0, p1}, Landroid/content/UriMatcher;->match(Landroid/net/Uri;)I

    move-result v2

    .line 458
    const/4 v0, -0x1

    if-ne v2, v0, :cond_0

    .line 460
    new-instance v3, Ljava/lang/IllegalArgumentException;

    const-string v0, "Unknown URL"

    invoke-direct {v3, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 461
    throw v3

    .line 464
    :cond_0
    invoke-direct {p0}, Lcom/huawei/health/sns/storage/db/SNSContentProvider;->d()Lnet/sqlcipher/database/SQLiteDatabase;

    move-result-object v3

    .line 465
    if-nez v3, :cond_1

    .line 467
    const/4 v0, 0x0

    return v0

    .line 470
    :cond_1
    const/4 v4, 0x0

    .line 473
    :try_start_0
    sget-object v0, Lcom/huawei/health/sns/storage/db/SNSContentProvider;->b:[Ljava/lang/String;

    rem-int/lit8 v1, v2, 0x32

    aget-object v0, v0, v1

    invoke-virtual {v3, v0, p2, p3}, Lnet/sqlcipher/database/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    move v4, v0

    .line 478
    goto :goto_0

    .line 475
    :catch_0
    move-exception v5

    .line 477
    const-string v0, "SNSProvider"

    const-string v1, "delete db meet IllegalStateException."

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 483
    :goto_0
    return v4
.end method

.method private b(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)Landroid/os/Bundle;
    .locals 5

    .line 921
    invoke-super {p0, p1, p2, p3}, Landroid/content/ContentProvider;->call(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)Landroid/os/Bundle;

    .line 922
    invoke-direct {p0}, Lcom/huawei/health/sns/storage/db/SNSContentProvider;->d()Lnet/sqlcipher/database/SQLiteDatabase;

    move-result-object v1

    .line 923
    if-eqz v1, :cond_0

    if-eqz p3, :cond_0

    invoke-virtual {p3, p2}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 926
    :cond_0
    return-object p3

    .line 928
    :cond_1
    invoke-virtual {p3, p2}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Landroid/content/ContentValues;

    .line 930
    const/4 v0, 0x0

    invoke-virtual {v1, p1, v0, v2}, Lnet/sqlcipher/database/SQLiteDatabase;->replace(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J

    move-result-wide v3

    .line 931
    const-string v0, "rowID"

    invoke-virtual {p3, v0, v3, v4}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    .line 932
    return-object p3
.end method

.method private b()Lnet/sqlcipher/database/SQLiteDatabase;
    .locals 6

    .line 402
    invoke-virtual {p0}, Lcom/huawei/health/sns/storage/db/SNSContentProvider;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/bbv;->c(Landroid/content/Context;)Lo/bbv;

    move-result-object v3

    .line 403
    if-nez v3, :cond_0

    .line 405
    const-string v0, "SNSProvider"

    const-string v1, "SQLiteOpenHelper is null."

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 406
    const/4 v0, 0x0

    return-object v0

    .line 408
    :cond_0
    const/4 v4, 0x0

    .line 412
    :try_start_0
    invoke-static {}, Lo/bby;->e()Lo/bby;

    move-result-object v0

    invoke-virtual {v0}, Lo/bby;->b()Ljava/lang/String;

    move-result-object v5

    .line 414
    invoke-virtual {v3, v5}, Lnet/sqlcipher/database/SQLiteOpenHelper;->getReadableDatabase(Ljava/lang/String;)Lnet/sqlcipher/database/SQLiteDatabase;
    :try_end_0
    .catch Lo/ayr; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_1

    move-result-object v0

    move-object v4, v0

    .line 425
    goto :goto_0

    .line 416
    :catch_0
    move-exception v5

    .line 418
    const-string v0, "SNSProvider"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "ReadDB getOrCreateDBKey meet SNSDBKeyException."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v5}, Lo/ayr;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 419
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "getReadableDatabase SNSDBKeyException."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v5}, Lo/ayr;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/bpj;->b(Ljava/lang/String;)V

    .line 425
    goto :goto_0

    .line 421
    :catch_1
    move-exception v5

    .line 423
    const-string v0, "SNSProvider"

    const-string v1, "getReadableDatabase meet exception."

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 424
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "getReadableDatabase meet exception."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v5}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/bpj;->b(Ljava/lang/String;)V

    .line 426
    :goto_0
    return-object v4
.end method

.method private c(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    .locals 15

    .line 593
    sget-object v0, Lcom/huawei/health/sns/storage/db/SNSContentProvider;->c:Landroid/content/UriMatcher;

    move-object/from16 v1, p1

    invoke-virtual {v0, v1}, Landroid/content/UriMatcher;->match(Landroid/net/Uri;)I

    move-result v9

    .line 594
    const/4 v0, -0x1

    if-ne v9, v0, :cond_0

    .line 596
    new-instance v10, Ljava/lang/IllegalArgumentException;

    const-string v0, "Unknown URL"

    invoke-direct {v10, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 597
    throw v10

    .line 600
    :cond_0
    sget-object v0, Lcom/huawei/health/sns/storage/db/SNSContentProvider;->b:[Ljava/lang/String;

    rem-int/lit8 v1, v9, 0x32

    aget-object v10, v0, v1

    .line 601
    const/4 v11, 0x0

    .line 603
    invoke-direct {p0}, Lcom/huawei/health/sns/storage/db/SNSContentProvider;->b()Lnet/sqlcipher/database/SQLiteDatabase;

    move-result-object v12

    .line 604
    if-nez v12, :cond_1

    .line 606
    const/4 v0, 0x0

    return-object v0

    .line 609
    :cond_1
    new-instance v13, Ljava/lang/StringBuilder;

    invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V

    .line 611
    const/16 v0, 0x64

    if-ge v9, v0, :cond_5

    .line 614
    const/16 v0, 0x32

    if-lt v9, v0, :cond_2

    .line 616
    invoke-virtual/range {p1 .. p1}, Landroid/net/Uri;->getPathSegments()Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v14, v0

    check-cast v14, Ljava/lang/String;

    .line 617
    const-string v0, "_id = "

    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 618
    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 620
    :cond_2
    if-eqz p3, :cond_4

    invoke-virtual/range {p3 .. p3}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_4

    .line 622
    invoke-virtual {v13}, Ljava/lang/StringBuilder;->length()I

    move-result v0

    if-lez v0, :cond_3

    .line 624
    const-string v0, " AND "

    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 627
    :cond_3
    const/16 v0, 0x28

    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 628
    move-object/from16 v0, p3

    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 629
    const/16 v0, 0x29

    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 633
    :cond_4
    move-object v0, v12

    move-object v1, v10

    move-object/from16 v2, p2

    :try_start_0
    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    move-object/from16 v4, p4

    move-object/from16 v7, p5

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    invoke-virtual/range {v0 .. v8}, Lnet/sqlcipher/database/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lnet/sqlcipher/Cursor;
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    move-object v11, v0

    .line 639
    goto :goto_0

    .line 636
    :catch_0
    move-exception v14

    .line 638
    const-string v0, "SNSProvider"

    const-string v1, "query db meet IllegalStateException."

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 639
    goto :goto_0

    .line 645
    :cond_5
    move-object v0, p0

    move-object/from16 v1, p2

    move-object/from16 v2, p3

    move-object/from16 v3, p4

    move-object/from16 v4, p5

    move v5, v9

    move-object v6, v12

    :try_start_1
    invoke-direct/range {v0 .. v6}, Lcom/huawei/health/sns/storage/db/SNSContentProvider;->e([Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;ILnet/sqlcipher/database/SQLiteDatabase;)Landroid/database/Cursor;
    :try_end_1
    .catch Ljava/lang/IllegalStateException; {:try_start_1 .. :try_end_1} :catch_1

    move-result-object v0

    move-object v11, v0

    .line 650
    goto :goto_0

    .line 647
    :catch_1
    move-exception v14

    .line 649
    const-string v0, "SNSProvider"

    const-string v1, "query db multiTab meet IllegalStateException."

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 653
    :goto_0
    const/4 v0, 0x0

    if-eq v0, v11, :cond_6

    .line 655
    invoke-virtual {p0}, Lcom/huawei/health/sns/storage/db/SNSContentProvider;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    move-object/from16 v1, p1

    invoke-interface {v11, v0, v1}, Landroid/database/Cursor;->setNotificationUri(Landroid/content/ContentResolver;Landroid/net/Uri;)V

    .line 657
    :cond_6
    return-object v11
.end method

.method private c(Ljava/util/ArrayList;)[Landroid/content/ContentProviderResult;
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Landroid/content/ContentProviderOperation;>;)[Landroid/content/ContentProviderResult;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/content/OperationApplicationException;
        }
    .end annotation

    .line 837
    invoke-direct {p0}, Lcom/huawei/health/sns/storage/db/SNSContentProvider;->d()Lnet/sqlcipher/database/SQLiteDatabase;

    move-result-object v2

    .line 838
    if-nez v2, :cond_0

    .line 840
    const/4 v0, 0x0

    new-array v0, v0, [Landroid/content/ContentProviderResult;

    return-object v0

    .line 843
    :cond_0
    invoke-virtual {v2}, Lnet/sqlcipher/database/SQLiteDatabase;->beginTransaction()V

    .line 845
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v3

    .line 846
    new-array v4, v3, [Landroid/content/ContentProviderResult;

    .line 847
    new-instance v5, Ljava/util/HashMap;

    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    .line 848
    const/4 v6, 0x0

    .line 849
    const/4 v7, 0x0

    .line 853
    const/4 v8, 0x0

    :goto_0
    if-ge v8, v3, :cond_2

    .line 855
    :try_start_0
    invoke-virtual {p1, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/ContentProviderOperation;

    invoke-virtual {v0, p0, v4, v8}, Landroid/content/ContentProviderOperation;->apply(Landroid/content/ContentProvider;[Landroid/content/ContentProviderResult;I)Landroid/content/ContentProviderResult;

    move-result-object v0

    aput-object v0, v4, v8

    .line 856
    sget-object v0, Lcom/huawei/health/sns/storage/db/SNSContentProvider;->c:Landroid/content/UriMatcher;

    invoke-virtual {p1, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/content/ContentProviderOperation;

    invoke-virtual {v1}, Landroid/content/ContentProviderOperation;->getUri()Landroid/net/Uri;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/content/UriMatcher;->match(Landroid/net/Uri;)I

    move-result v7

    .line 857
    sget-object v0, Lcom/huawei/health/sns/storage/db/SNSContentProvider;->b:[Ljava/lang/String;

    rem-int/lit8 v1, v7, 0x32

    aget-object v6, v0, v1

    .line 858
    invoke-interface {v5, v6}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 860
    invoke-virtual {p1, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/ContentProviderOperation;

    invoke-virtual {v0}, Landroid/content/ContentProviderOperation;->getUri()Landroid/net/Uri;

    move-result-object v0

    invoke-interface {v5, v6, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 853
    :cond_1
    add-int/lit8 v8, v8, 0x1

    goto :goto_0

    .line 863
    :cond_2
    invoke-virtual {v2}, Lnet/sqlcipher/database/SQLiteDatabase;->setTransactionSuccessful()V

    .line 864
    invoke-interface {v5}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_4

    .line 866
    invoke-virtual {p0}, Lcom/huawei/health/sns/storage/db/SNSContentProvider;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v8

    .line 867
    invoke-interface {v5}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v9

    .line 868
    const/4 v10, 0x0

    .line 869
    const/4 v11, 0x0

    .line 870
    :cond_3
    :goto_1
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 872
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Ljava/util/Map$Entry;

    .line 873
    invoke-interface {v10}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Landroid/net/Uri;

    .line 874
    if-eqz v11, :cond_3

    .line 876
    const/4 v0, 0x0

    invoke-virtual {v8, v11, v0}, Landroid/content/ContentResolver;->notifyChange(Landroid/net/Uri;Landroid/database/ContentObserver;)V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    .line 887
    :cond_4
    invoke-virtual {v2}, Lnet/sqlcipher/database/SQLiteDatabase;->endTransaction()V

    .line 888
    goto :goto_2

    .line 881
    :catch_0
    move-exception v8

    .line 883
    const-string v0, "SNSProvider"

    const-string v1, "applyBatch db meet IllegalStateException."

    :try_start_1
    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 887
    invoke-virtual {v2}, Lnet/sqlcipher/database/SQLiteDatabase;->endTransaction()V

    .line 888
    goto :goto_2

    .line 887
    :catchall_0
    move-exception v12

    invoke-virtual {v2}, Lnet/sqlcipher/database/SQLiteDatabase;->endTransaction()V

    .line 888
    throw v12

    .line 889
    :goto_2
    return-object v4
.end method

.method private d()Lnet/sqlcipher/database/SQLiteDatabase;
    .locals 6

    .line 368
    invoke-virtual {p0}, Lcom/huawei/health/sns/storage/db/SNSContentProvider;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/bbv;->c(Landroid/content/Context;)Lo/bbv;

    move-result-object v3

    .line 369
    if-nez v3, :cond_0

    .line 371
    const-string v0, "SNSProvider"

    const-string v1, "SQLiteOpenHelper is null."

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 372
    const/4 v0, 0x0

    return-object v0

    .line 374
    :cond_0
    const/4 v4, 0x0

    .line 378
    :try_start_0
    invoke-static {}, Lo/bby;->e()Lo/bby;

    move-result-object v0

    invoke-virtual {v0}, Lo/bby;->b()Ljava/lang/String;

    move-result-object v5

    .line 380
    invoke-virtual {v3, v5}, Lnet/sqlcipher/database/SQLiteOpenHelper;->getWritableDatabase(Ljava/lang/String;)Lnet/sqlcipher/database/SQLiteDatabase;
    :try_end_0
    .catch Lo/ayr; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_1

    move-result-object v0

    move-object v4, v0

    .line 391
    goto :goto_0

    .line 382
    :catch_0
    move-exception v5

    .line 384
    const-string v0, "SNSProvider"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "WriteDB getOrCreateDBKey meet SNSDBKeyException."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v5}, Lo/ayr;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 385
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "getWritableDatabase meet SNSDBKeyException."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v5}, Lo/ayr;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/bpj;->b(Ljava/lang/String;)V

    .line 391
    goto :goto_0

    .line 387
    :catch_1
    move-exception v5

    .line 389
    const-string v0, "SNSProvider"

    const-string v1, "getWritableDatabase meet exception."

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 390
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "getWritableDatabase meet exception."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v5}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/bpj;->b(Ljava/lang/String;)V

    .line 392
    :goto_0
    return-object v4
.end method

.method private e([Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;ILnet/sqlcipher/database/SQLiteDatabase;)Landroid/database/Cursor;
    .locals 9

    .line 674
    const/4 v8, 0x0

    .line 676
    packed-switch p5, :pswitch_data_0

    goto/16 :goto_0

    .line 681
    :pswitch_0
    move-object v0, p6

    const-string v1, "t_group_member left join t_user on t_group_member.user_id = t_user.user_id"

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v7, p4

    .line 682
    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-virtual/range {v0 .. v7}, Lnet/sqlcipher/database/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lnet/sqlcipher/Cursor;

    move-result-object v8

    .line 683
    goto/16 :goto_0

    .line 687
    :pswitch_1
    move-object v0, p6

    const-string v1, "t_user_notify left join t_user on t_user_notify.user_id = t_user.user_id"

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v7, p4

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-virtual/range {v0 .. v7}, Lnet/sqlcipher/database/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lnet/sqlcipher/Cursor;

    move-result-object v8

    .line 688
    goto :goto_0

    .line 692
    :pswitch_2
    move-object v0, p6

    const-string v1, " ( t_conversation left join t_user on t_conversation.user_id = t_user.user_id )  left join t_group on t_conversation.user_id = t_group.group_id"

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v7, p4

    .line 693
    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-virtual/range {v0 .. v7}, Lnet/sqlcipher/database/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lnet/sqlcipher/Cursor;

    move-result-object v8

    .line 694
    goto :goto_0

    .line 698
    :pswitch_3
    move-object v0, p6

    const-string v1, "t_group_notify left join t_user on t_group_notify.user_id = t_user.user_id"

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v7, p4

    .line 699
    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-virtual/range {v0 .. v7}, Lnet/sqlcipher/database/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lnet/sqlcipher/Cursor;

    move-result-object v8

    .line 700
    goto :goto_0

    .line 704
    :pswitch_4
    move-object v0, p6

    const-string v1, "t_conversation left join t_group on t_conversation.user_id = t_group.group_id"

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v7, p4

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-virtual/range {v0 .. v7}, Lnet/sqlcipher/database/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lnet/sqlcipher/Cursor;

    move-result-object v8

    .line 706
    goto :goto_0

    .line 710
    :pswitch_5
    move-object v0, p6

    const-string v1, "t_assistant left join t_user on t_assistant.user_id = t_user.user_id"

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v7, p4

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-virtual/range {v0 .. v7}, Lnet/sqlcipher/database/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lnet/sqlcipher/Cursor;

    move-result-object v8

    .line 711
    goto :goto_0

    .line 715
    :pswitch_6
    move-object v0, p6

    const-string v1, " ( t_group_member left join t_user on t_group_member.user_id = t_user.user_id )  left join t_group on t_group_member.group_id = t_group.group_id"

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v7, p4

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-virtual/range {v0 .. v7}, Lnet/sqlcipher/database/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lnet/sqlcipher/Cursor;

    move-result-object v8

    .line 717
    goto :goto_0

    .line 721
    :pswitch_7
    move-object v0, p6

    const-string v1, "t_user_circle left join t_circle_content on t_user_circle._id = t_circle_content.circle_id"

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v7, p4

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-virtual/range {v0 .. v7}, Lnet/sqlcipher/database/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lnet/sqlcipher/Cursor;

    move-result-object v8

    .line 722
    .line 727
    :goto_0
    return-object v8

    nop

    :pswitch_data_0
    .packed-switch 0x64
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
        :pswitch_6
        :pswitch_7
    .end packed-switch
.end method

.method private e(Landroid/net/Uri;Landroid/content/ContentValues;)Landroid/net/Uri;
    .locals 8

    .line 517
    invoke-direct {p0}, Lcom/huawei/health/sns/storage/db/SNSContentProvider;->d()Lnet/sqlcipher/database/SQLiteDatabase;

    move-result-object v2

    .line 518
    if-nez v2, :cond_0

    .line 520
    const/4 v0, 0x0

    return-object v0

    .line 523
    :cond_0
    sget-object v0, Lcom/huawei/health/sns/storage/db/SNSContentProvider;->c:Landroid/content/UriMatcher;

    invoke-virtual {v0, p1}, Landroid/content/UriMatcher;->match(Landroid/net/Uri;)I

    move-result v3

    .line 524
    const/4 v0, -0x1

    if-ne v3, v0, :cond_1

    .line 526
    new-instance v4, Ljava/lang/IllegalArgumentException;

    const-string v0, "Unknown URL"

    invoke-direct {v4, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 527
    throw v4

    .line 530
    :cond_1
    const/4 v4, 0x0

    .line 531
    const-wide/16 v5, -0x1

    .line 534
    :try_start_0
    sget-object v0, Lcom/huawei/health/sns/storage/db/SNSContentProvider;->b:[Ljava/lang/String;

    rem-int/lit8 v1, v3, 0x32

    aget-object v0, v0, v1

    const/4 v1, 0x0

    invoke-virtual {v2, v0, v1, p2}, Lnet/sqlcipher/database/SQLiteDatabase;->insert(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-wide v0

    move-wide v5, v0

    .line 539
    goto :goto_0

    .line 536
    :catch_0
    move-exception v7

    .line 538
    const-string v0, "SNSProvider"

    const-string v1, "insert db meet IllegalStateException."

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 541
    :goto_0
    const-wide/16 v0, 0x0

    cmp-long v0, v5, v0

    if-lez v0, :cond_2

    .line 543
    invoke-static {p1, v5, v6}, Landroid/content/ContentUris;->withAppendedId(Landroid/net/Uri;J)Landroid/net/Uri;

    move-result-object v4

    .line 550
    :cond_2
    return-object v4
.end method


# virtual methods
.method public applyBatch(Ljava/util/ArrayList;)[Landroid/content/ContentProviderResult;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Landroid/content/ContentProviderOperation;>;)[Landroid/content/ContentProviderResult;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/content/OperationApplicationException;
        }
    .end annotation

    .line 823
    :try_start_0
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/storage/db/SNSContentProvider;->c(Ljava/util/ArrayList;)[Landroid/content/ContentProviderResult;
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    return-object v0

    .line 825
    :catch_0
    move-exception v2

    .line 828
    new-instance v0, Landroid/content/OperationApplicationException;

    invoke-virtual {v2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/content/OperationApplicationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public call(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)Landroid/os/Bundle;
    .locals 3

    .line 906
    :try_start_0
    invoke-direct {p0, p1, p2, p3}, Lcom/huawei/health/sns/storage/db/SNSContentProvider;->b(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)Landroid/os/Bundle;
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    return-object v0

    .line 908
    :catch_0
    move-exception v2

    .line 910
    const-string v0, "SNSProvider"

    const-string v1, "call meet exception."

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 912
    new-instance v0, Landroid/database/SQLException;

    invoke-virtual {v2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/database/SQLException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public delete(Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;)I
    .locals 3

    .line 442
    :try_start_0
    invoke-direct {p0, p1, p2, p3}, Lcom/huawei/health/sns/storage/db/SNSContentProvider;->a(Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    return v0

    .line 444
    :catch_0
    move-exception v2

    .line 446
    const-string v0, "SNSProvider"

    const-string v1, "delete meet exception."

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 448
    new-instance v0, Landroid/database/SQLException;

    invoke-virtual {v2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/database/SQLException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public e(Landroid/net/Uri;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I
    .locals 6

    .line 767
    invoke-direct {p0}, Lcom/huawei/health/sns/storage/db/SNSContentProvider;->d()Lnet/sqlcipher/database/SQLiteDatabase;

    move-result-object v2

    .line 768
    if-nez v2, :cond_0

    .line 770
    const/4 v0, 0x0

    return v0

    .line 773
    :cond_0
    sget-object v0, Lcom/huawei/health/sns/storage/db/SNSContentProvider;->c:Landroid/content/UriMatcher;

    invoke-virtual {v0, p1}, Landroid/content/UriMatcher;->match(Landroid/net/Uri;)I

    move-result v3

    .line 774
    const/4 v0, -0x1

    if-ne v3, v0, :cond_1

    .line 776
    new-instance v4, Ljava/lang/IllegalArgumentException;

    const-string v0, "Unknown URL"

    invoke-direct {v4, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 777
    throw v4

    .line 780
    :cond_1
    const/16 v0, 0x32

    if-lt v3, v0, :cond_3

    .line 782
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 783
    if-eqz p3, :cond_2

    invoke-virtual {p3}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_2

    .line 785
    const-string v0, "( "

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 786
    invoke-virtual {v4, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 787
    const-string v0, " ) AND "

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 789
    :cond_2
    invoke-virtual {p1}, Landroid/net/Uri;->getPathSegments()Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Ljava/lang/String;

    .line 790
    const-string v0, "_id = "

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 791
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 792
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    .line 794
    :cond_3
    const/4 v4, 0x0

    .line 797
    :try_start_0
    sget-object v0, Lcom/huawei/health/sns/storage/db/SNSContentProvider;->b:[Ljava/lang/String;

    rem-int/lit8 v1, v3, 0x32

    aget-object v0, v0, v1

    invoke-virtual {v2, v0, p2, p3, p4}, Lnet/sqlcipher/database/SQLiteDatabase;->update(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    move v4, v0

    .line 802
    goto :goto_0

    .line 799
    :catch_0
    move-exception v5

    .line 801
    const-string v0, "SNSProvider"

    const-string v1, "update db meet IllegalStateException."

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 807
    :goto_0
    return v4
.end method

.method public getType(Landroid/net/Uri;)Ljava/lang/String;
    .locals 1

    .line 489
    const/4 v0, 0x0

    return-object v0
.end method

.method public insert(Landroid/net/Uri;Landroid/content/ContentValues;)Landroid/net/Uri;
    .locals 4

    .line 498
    :try_start_0
    invoke-direct {p0, p1, p2}, Lcom/huawei/health/sns/storage/db/SNSContentProvider;->e(Landroid/net/Uri;Landroid/content/ContentValues;)Landroid/net/Uri;
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v2

    .line 504
    goto :goto_0

    .line 500
    :catch_0
    move-exception v3

    .line 502
    const-string v0, "SNSProvider"

    const-string v1, "insert meet exception."

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 503
    new-instance v0, Landroid/database/SQLException;

    invoke-virtual {v3}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/database/SQLException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 505
    :goto_0
    return-object v2
.end method

.method public onCreate()Z
    .locals 1

    .line 360
    const/4 v0, 0x1

    return v0
.end method

.method public query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    .locals 4

    .line 570
    :try_start_0
    invoke-direct/range {p0 .. p5}, Lcom/huawei/health/sns/storage/db/SNSContentProvider;->c(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v2

    .line 577
    goto :goto_0

    .line 572
    :catch_0
    move-exception v3

    .line 574
    const-string v0, "SNSProvider"

    const-string v1, "query meet exception."

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 576
    new-instance v0, Landroid/database/SQLException;

    invoke-virtual {v3}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/database/SQLException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 578
    :goto_0
    return-object v2
.end method

.method public update(Landroid/net/Uri;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I
    .locals 4

    .line 745
    :try_start_0
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/huawei/health/sns/storage/db/SNSContentProvider;->e(Landroid/net/Uri;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    move-result v2

    .line 752
    goto :goto_0

    .line 747
    :catch_0
    move-exception v3

    .line 749
    const-string v0, "SNSProvider"

    const-string v1, "update meet exception."

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 751
    new-instance v0, Landroid/database/SQLException;

    invoke-virtual {v3}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/database/SQLException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 753
    :goto_0
    return v2
.end method
