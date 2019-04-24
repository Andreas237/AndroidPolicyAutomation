.class public Lcom/huawei/hwuserlabelmgr/db/provider/UserProfileProvider;
.super Landroid/content/ContentProvider;
.source "SourceFile"


# instance fields
.field private c:Lo/dnh;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 17
    invoke-direct {p0}, Landroid/content/ContentProvider;-><init>()V

    .line 19
    return-void
.end method


# virtual methods
.method public delete(Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;)I
    .locals 1

    .line 74
    const/4 v0, 0x0

    return v0
.end method

.method public getType(Landroid/net/Uri;)Ljava/lang/String;
    .locals 1

    .line 64
    const/4 v0, 0x0

    return-object v0
.end method

.method public insert(Landroid/net/Uri;Landroid/content/ContentValues;)Landroid/net/Uri;
    .locals 1

    .line 69
    const/4 v0, 0x0

    return-object v0
.end method

.method public onCreate()Z
    .locals 2

    .line 25
    invoke-virtual {p0}, Lcom/huawei/hwuserlabelmgr/db/provider/UserProfileProvider;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dnh;->a(Landroid/content/Context;)Lo/dnh;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hwuserlabelmgr/db/provider/UserProfileProvider;->c:Lo/dnh;

    .line 26
    iget-object v0, p0, Lcom/huawei/hwuserlabelmgr/db/provider/UserProfileProvider;->c:Lo/dnh;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 27
    const/4 v0, 0x0

    return v0

    .line 29
    :cond_0
    const/4 v0, 0x1

    return v0
.end method

.method public query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    .locals 7

    .line 38
    invoke-virtual {p1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v4

    .line 39
    const-string v0, "/"

    invoke-virtual {v4, v0}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v1

    invoke-virtual {v4, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v5

    .line 40
    const-string v0, "UserProfileProvider"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "key = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 41
    const/4 v6, 0x0

    .line 59
    return-object v6
.end method

.method public update(Landroid/net/Uri;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I
    .locals 1

    .line 79
    const/4 v0, 0x0

    return v0
.end method
