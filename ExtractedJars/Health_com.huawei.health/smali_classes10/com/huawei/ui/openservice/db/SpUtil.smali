.class public Lcom/huawei/ui/openservice/db/SpUtil;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final SP:Ljava/lang/String; = "OpenServiceSpUtil"

.field private static final UPGRADE:Ljava/lang/String; = "Upgrade"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static isUpgrade(Landroid/content/Context;)Z
    .locals 3

    .line 17
    if-nez p0, :cond_0

    const/4 v0, 0x0

    return v0

    .line 18
    :cond_0
    const-string v0, "OpenServiceSpUtil"

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    const-string v1, "Upgrade"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    return v0
.end method

.method public static setUpgrade(Landroid/content/Context;Z)V
    .locals 2

    .line 22
    if-nez p0, :cond_0

    return-void

    .line 23
    :cond_0
    const-string v0, "OpenServiceSpUtil"

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "Upgrade"

    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 24
    return-void
.end method
