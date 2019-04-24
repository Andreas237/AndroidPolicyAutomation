.class public Lcom/shopkick/app/flags/SKFlags;
.super Ljava/lang/Object;
.source "SKFlags.java"


# static fields
.field public static final FLAGS_PREFS_NAME:Ljava/lang/String; = "com.shopkick.app.flags"

.field public static skflags:Lcom/shopkick/app/flags/SKFlags;


# instance fields
.field private enabledFlags:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private flagsToDescriptions:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private inDebugMode:Z

.field private prefs:Landroid/content/SharedPreferences;

.field private registeredFlags:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;Z)V
    .locals 2

    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p1, :cond_1

    const-string v0, "com.shopkick.app.flags"

    const/4 v1, 0x0

    .line 37
    invoke-virtual {p1, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/app/flags/SKFlags;->prefs:Landroid/content/SharedPreferences;

    .line 38
    iput-boolean p2, p0, Lcom/shopkick/app/flags/SKFlags;->inDebugMode:Z

    if-eqz p2, :cond_0

    .line 40
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Lcom/shopkick/app/flags/SKFlags;->flagsToDescriptions:Ljava/util/HashMap;

    .line 41
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/shopkick/app/flags/SKFlags;->registeredFlags:Ljava/util/ArrayList;

    goto :goto_0

    .line 43
    :cond_0
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/shopkick/app/flags/SKFlags;->enabledFlags:Ljava/util/ArrayList;

    :goto_0
    return-void

    .line 34
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "The argument \'context\' cannot be null"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static getInstance()Lcom/shopkick/app/flags/SKFlags;
    .locals 1

    .line 29
    sget-object v0, Lcom/shopkick/app/flags/SKFlags;->skflags:Lcom/shopkick/app/flags/SKFlags;

    return-object v0
.end method

.method public static init(Landroid/content/Context;Z)V
    .locals 1

    .line 23
    sget-object v0, Lcom/shopkick/app/flags/SKFlags;->skflags:Lcom/shopkick/app/flags/SKFlags;

    if-nez v0, :cond_0

    .line 24
    new-instance v0, Lcom/shopkick/app/flags/SKFlags;

    invoke-direct {v0, p0, p1}, Lcom/shopkick/app/flags/SKFlags;-><init>(Landroid/content/Context;Z)V

    sput-object v0, Lcom/shopkick/app/flags/SKFlags;->skflags:Lcom/shopkick/app/flags/SKFlags;

    :cond_0
    return-void
.end method

.method private setFlagEnabledHelper(Ljava/lang/String;Z)V
    .locals 1

    .line 112
    iget-object v0, p0, Lcom/shopkick/app/flags/SKFlags;->prefs:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    .line 113
    invoke-interface {v0, p1, p2}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 114
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method


# virtual methods
.method public getFlagDescription(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 87
    iget-boolean v0, p0, Lcom/shopkick/app/flags/SKFlags;->inDebugMode:Z

    if-eqz v0, :cond_0

    .line 88
    iget-object v0, p0, Lcom/shopkick/app/flags/SKFlags;->flagsToDescriptions:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public getFlags()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 80
    iget-boolean v0, p0, Lcom/shopkick/app/flags/SKFlags;->inDebugMode:Z

    if-eqz v0, :cond_0

    .line 81
    iget-object v0, p0, Lcom/shopkick/app/flags/SKFlags;->registeredFlags:Ljava/util/ArrayList;

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public getFloat(Ljava/lang/String;F)F
    .locals 1

    .line 108
    iget-object v0, p0, Lcom/shopkick/app/flags/SKFlags;->prefs:Landroid/content/SharedPreferences;

    invoke-interface {v0, p1, p2}, Landroid/content/SharedPreferences;->getFloat(Ljava/lang/String;F)F

    move-result p1

    return p1
.end method

.method public getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 124
    iget-object v0, p0, Lcom/shopkick/app/flags/SKFlags;->prefs:Landroid/content/SharedPreferences;

    invoke-interface {v0, p1, p2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public isFlagEnabled(Ljava/lang/String;)Z
    .locals 2

    .line 71
    iget-boolean v0, p0, Lcom/shopkick/app/flags/SKFlags;->inDebugMode:Z

    if-eqz v0, :cond_0

    .line 72
    iget-object v0, p0, Lcom/shopkick/app/flags/SKFlags;->prefs:Landroid/content/SharedPreferences;

    const/4 v1, 0x0

    invoke-interface {v0, p1, v1}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result p1

    return p1

    .line 74
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/flags/SKFlags;->enabledFlags:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public isInDebugMode()Z
    .locals 1

    .line 48
    iget-boolean v0, p0, Lcom/shopkick/app/flags/SKFlags;->inDebugMode:Z

    return v0
.end method

.method public putFloat(Ljava/lang/String;F)V
    .locals 1

    .line 102
    iget-object v0, p0, Lcom/shopkick/app/flags/SKFlags;->prefs:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    .line 103
    invoke-interface {v0, p1, p2}, Landroid/content/SharedPreferences$Editor;->putFloat(Ljava/lang/String;F)Landroid/content/SharedPreferences$Editor;

    .line 104
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method

.method public putString(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 118
    iget-object v0, p0, Lcom/shopkick/app/flags/SKFlags;->prefs:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    .line 119
    invoke-interface {v0, p1, p2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 120
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method

.method public registerFlag(Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 1

    .line 52
    iget-boolean v0, p0, Lcom/shopkick/app/flags/SKFlags;->inDebugMode:Z

    if-eqz v0, :cond_1

    .line 53
    iget-object v0, p0, Lcom/shopkick/app/flags/SKFlags;->flagsToDescriptions:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 54
    iget-object v0, p0, Lcom/shopkick/app/flags/SKFlags;->flagsToDescriptions:Ljava/util/HashMap;

    invoke-virtual {v0, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 55
    iget-object p2, p0, Lcom/shopkick/app/flags/SKFlags;->registeredFlags:Ljava/util/ArrayList;

    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 58
    :cond_0
    iget-object p2, p0, Lcom/shopkick/app/flags/SKFlags;->prefs:Landroid/content/SharedPreferences;

    invoke-interface {p2, p1}, Landroid/content/SharedPreferences;->contains(Ljava/lang/String;)Z

    move-result p2

    if-nez p2, :cond_2

    .line 59
    invoke-direct {p0, p1, p3}, Lcom/shopkick/app/flags/SKFlags;->setFlagEnabledHelper(Ljava/lang/String;Z)V

    goto :goto_0

    :cond_1
    if-eqz p3, :cond_2

    .line 63
    iget-object p2, p0, Lcom/shopkick/app/flags/SKFlags;->enabledFlags:Ljava/util/ArrayList;

    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_2

    .line 64
    iget-object p2, p0, Lcom/shopkick/app/flags/SKFlags;->enabledFlags:Ljava/util/ArrayList;

    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_2
    :goto_0
    return-void
.end method

.method public toggleFlag(Ljava/lang/String;)V
    .locals 1

    .line 94
    iget-boolean v0, p0, Lcom/shopkick/app/flags/SKFlags;->inDebugMode:Z

    if-eqz v0, :cond_1

    .line 95
    iget-object v0, p0, Lcom/shopkick/app/flags/SKFlags;->registeredFlags:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 96
    :cond_0
    invoke-virtual {p0, p1}, Lcom/shopkick/app/flags/SKFlags;->isFlagEnabled(Ljava/lang/String;)Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    .line 97
    invoke-direct {p0, p1, v0}, Lcom/shopkick/app/flags/SKFlags;->setFlagEnabledHelper(Ljava/lang/String;Z)V

    :cond_1
    return-void
.end method
