.class public Lcom/huawei/pluginmessagecenter/service/MessageGenerator;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final TAG:Ljava/lang/String; = "MessageGenerator"

.field private static volatile instance:Lcom/huawei/pluginmessagecenter/service/MessageGenerator; = null


# instance fields
.field private mContext:Landroid/content/Context;


# direct methods
.method private constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 21
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/pluginmessagecenter/service/MessageGenerator;->mContext:Landroid/content/Context;

    .line 22
    return-void
.end method

.method public static getInstance(Landroid/content/Context;)Lcom/huawei/pluginmessagecenter/service/MessageGenerator;
    .locals 3

    .line 25
    sget-object v0, Lcom/huawei/pluginmessagecenter/service/MessageGenerator;->instance:Lcom/huawei/pluginmessagecenter/service/MessageGenerator;

    if-nez v0, :cond_1

    .line 26
    const-class v1, Lcom/huawei/pluginmessagecenter/service/MessageGenerator;

    monitor-enter v1

    .line 27
    :try_start_0
    sget-object v0, Lcom/huawei/pluginmessagecenter/service/MessageGenerator;->instance:Lcom/huawei/pluginmessagecenter/service/MessageGenerator;

    if-nez v0, :cond_0

    .line 28
    new-instance v0, Lcom/huawei/pluginmessagecenter/service/MessageGenerator;

    invoke-direct {v0, p0}, Lcom/huawei/pluginmessagecenter/service/MessageGenerator;-><init>(Landroid/content/Context;)V

    sput-object v0, Lcom/huawei/pluginmessagecenter/service/MessageGenerator;->instance:Lcom/huawei/pluginmessagecenter/service/MessageGenerator;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 30
    :cond_0
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2

    .line 32
    :cond_1
    :goto_0
    sget-object v0, Lcom/huawei/pluginmessagecenter/service/MessageGenerator;->instance:Lcom/huawei/pluginmessagecenter/service/MessageGenerator;

    return-object v0
.end method

.method private isValidParam(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 1

    .line 71
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 72
    :cond_0
    const/4 v0, 0x0

    return v0

    .line 74
    :cond_1
    const/4 v0, 0x1

    return v0
.end method


# virtual methods
.method public generateMessage(Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;)Z
    .locals 5

    .line 43
    if-nez p1, :cond_0

    .line 44
    const-string v0, "MessageGenerator"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Message object is null."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 45
    const/4 v0, 0x0

    return v0

    .line 47
    :cond_0
    const-string v0, "MessageGenerator"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "generateMessage messageObjects============="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 48
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 49
    invoke-virtual {v4, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 50
    iget-object v0, p0, Lcom/huawei/pluginmessagecenter/service/MessageGenerator;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lo/eah;->e(Landroid/content/Context;)Lo/eah;

    move-result-object v0

    invoke-virtual {v0, v4}, Lo/eah;->c(Ljava/util/List;)Z

    move-result v0

    return v0
.end method

.method public requestMessageId(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    .line 61
    const-string v0, "MessageGenerator"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Enter requestMessageId | module = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "    type = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 62
    invoke-direct {p0, p1, p2}, Lcom/huawei/pluginmessagecenter/service/MessageGenerator;->isValidParam(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 63
    const-string v0, ""

    return-object v0

    .line 66
    :cond_0
    iget-object v0, p0, Lcom/huawei/pluginmessagecenter/service/MessageGenerator;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lo/eah;->e(Landroid/content/Context;)Lo/eah;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lo/eah;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
