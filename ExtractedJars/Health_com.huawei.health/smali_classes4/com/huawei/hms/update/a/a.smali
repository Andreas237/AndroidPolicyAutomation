.class Lcom/huawei/hms/update/a/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Ljava/lang/String;

.field private b:I

.field private c:Ljava/lang/String;

.field private d:I


# direct methods
.method constructor <init>()V
    .locals 0

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private b(Landroid/content/Context;Ljava/lang/String;)V
    .locals 4

    .line 81
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "com.huawei.hms.update.DOWNLOAD_RECORD"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v2

    .line 83
    invoke-interface {v2}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v3

    .line 85
    const-string v0, "mUri"

    iget-object v1, p0, Lcom/huawei/hms/update/a/a;->a:Ljava/lang/String;

    invoke-interface {v3, v0, v1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 86
    const-string v0, "mSize"

    iget v1, p0, Lcom/huawei/hms/update/a/a;->b:I

    invoke-interface {v3, v0, v1}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 87
    const-string v0, "mHash"

    iget-object v1, p0, Lcom/huawei/hms/update/a/a;->c:Ljava/lang/String;

    invoke-interface {v3, v0, v1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 88
    const-string v0, "mReceived"

    iget v1, p0, Lcom/huawei/hms/update/a/a;->d:I

    invoke-interface {v3, v0, v1}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 90
    invoke-interface {v3}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 91
    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    .line 99
    iget v0, p0, Lcom/huawei/hms/update/a/a;->b:I

    return v0
.end method

.method public a(Landroid/content/Context;ILjava/lang/String;)V
    .locals 0

    .line 75
    iput p2, p0, Lcom/huawei/hms/update/a/a;->d:I

    .line 77
    invoke-direct {p0, p1, p3}, Lcom/huawei/hms/update/a/a;->b(Landroid/content/Context;Ljava/lang/String;)V

    .line 78
    return-void
.end method

.method public a(Landroid/content/Context;Ljava/lang/String;)V
    .locals 3

    .line 47
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "com.huawei.hms.update.DOWNLOAD_RECORD"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v2

    .line 49
    const-string v0, "mUri"

    const-string v1, ""

    invoke-interface {v2, v0, v1}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hms/update/a/a;->a:Ljava/lang/String;

    .line 50
    const-string v0, "mSize"

    const/4 v1, 0x0

    invoke-interface {v2, v0, v1}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lcom/huawei/hms/update/a/a;->b:I

    .line 51
    const-string v0, "mHash"

    const-string v1, ""

    invoke-interface {v2, v0, v1}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hms/update/a/a;->c:Ljava/lang/String;

    .line 52
    const-string v0, "mReceived"

    const/4 v1, 0x0

    invoke-interface {v2, v0, v1}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lcom/huawei/hms/update/a/a;->d:I

    .line 53
    return-void
.end method

.method public a(Ljava/lang/String;ILjava/lang/String;)V
    .locals 1

    .line 62
    iput-object p1, p0, Lcom/huawei/hms/update/a/a;->a:Ljava/lang/String;

    .line 63
    iput p2, p0, Lcom/huawei/hms/update/a/a;->b:I

    .line 64
    iput-object p3, p0, Lcom/huawei/hms/update/a/a;->c:Ljava/lang/String;

    .line 65
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hms/update/a/a;->d:I

    .line 66
    return-void
.end method

.method b()I
    .locals 1

    .line 108
    iget v0, p0, Lcom/huawei/hms/update/a/a;->d:I

    return v0
.end method

.method public b(Ljava/lang/String;ILjava/lang/String;)Z
    .locals 2

    .line 120
    if-eqz p1, :cond_0

    if-eqz p3, :cond_0

    iget-object v0, p0, Lcom/huawei/hms/update/a/a;->a:Ljava/lang/String;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/hms/update/a/a;->a:Ljava/lang/String;

    .line 123
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget v0, p0, Lcom/huawei/hms/update/a/a;->b:I

    if-ne v0, p2, :cond_0

    iget-object v0, p0, Lcom/huawei/hms/update/a/a;->c:Ljava/lang/String;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/hms/update/a/a;->c:Ljava/lang/String;

    .line 126
    invoke-virtual {v0, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget v0, p0, Lcom/huawei/hms/update/a/a;->d:I

    iget v1, p0, Lcom/huawei/hms/update/a/a;->b:I

    if-gt v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 120
    :goto_0
    return v0
.end method
