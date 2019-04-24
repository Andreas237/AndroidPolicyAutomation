.class public Lo/agj;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Ljava/lang/String;

.field private d:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;)V
    .locals 0

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 15
    iput-object p2, p0, Lo/agj;->a:Ljava/lang/String;

    .line 16
    iput-object p1, p0, Lo/agj;->d:Landroid/content/Context;

    .line 17
    return-void
.end method


# virtual methods
.method public b(Ljava/lang/String;)Z
    .locals 4

    .line 35
    iget-object v0, p0, Lo/agj;->d:Landroid/content/Context;

    if-nez v0, :cond_0

    .line 36
    const/4 v0, 0x0

    return v0

    .line 39
    :cond_0
    iget-object v0, p0, Lo/agj;->d:Landroid/content/Context;

    iget-object v1, p0, Lo/agj;->a:Ljava/lang/String;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v3

    .line 41
    invoke-interface {v3, p1}, Landroid/content/SharedPreferences;->contains(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 42
    const/4 v0, 0x0

    return v0

    .line 44
    :cond_1
    const/4 v0, 0x0

    invoke-interface {v3, p1, v0}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    return v0
.end method

.method public c(Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    .line 21
    const-string v3, "0"

    .line 22
    iget-object v0, p0, Lo/agj;->d:Landroid/content/Context;

    if-nez v0, :cond_0

    .line 23
    return-object v3

    .line 26
    :cond_0
    iget-object v0, p0, Lo/agj;->d:Landroid/content/Context;

    iget-object v1, p0, Lo/agj;->a:Ljava/lang/String;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v4

    .line 28
    invoke-interface {v4, p1}, Landroid/content/SharedPreferences;->contains(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 29
    return-object v3

    .line 31
    :cond_1
    invoke-interface {v4, p1, v3}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
