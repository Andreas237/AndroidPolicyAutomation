.class public Lorg/aviran/cookiebar2/CookieBar;
.super Ljava/lang/Object;
.source "CookieBar.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/aviran/cookiebar2/CookieBar$Params;,
        Lorg/aviran/cookiebar2/CookieBar$Builder;
    }
.end annotation


# instance fields
.field private final context:Landroid/app/Activity;

.field private cookieView:Lorg/aviran/cookiebar2/Cookie;


# direct methods
.method private constructor <init>(Landroid/app/Activity;Lorg/aviran/cookiebar2/CookieBar$Params;)V
    .locals 1

    .line 38
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 39
    iput-object p1, p0, Lorg/aviran/cookiebar2/CookieBar;->context:Landroid/app/Activity;

    if-nez p2, :cond_0

    .line 43
    invoke-direct {p0}, Lorg/aviran/cookiebar2/CookieBar;->dismiss()V

    return-void

    .line 47
    :cond_0
    new-instance v0, Lorg/aviran/cookiebar2/Cookie;

    invoke-direct {v0, p1}, Lorg/aviran/cookiebar2/Cookie;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lorg/aviran/cookiebar2/CookieBar;->cookieView:Lorg/aviran/cookiebar2/Cookie;

    .line 48
    iget-object p1, p0, Lorg/aviran/cookiebar2/CookieBar;->cookieView:Lorg/aviran/cookiebar2/Cookie;

    invoke-virtual {p1, p2}, Lorg/aviran/cookiebar2/Cookie;->setParams(Lorg/aviran/cookiebar2/CookieBar$Params;)V

    return-void
.end method

.method synthetic constructor <init>(Landroid/app/Activity;Lorg/aviran/cookiebar2/CookieBar$Params;Lorg/aviran/cookiebar2/CookieBar$1;)V
    .locals 0

    .line 26
    invoke-direct {p0, p1, p2}, Lorg/aviran/cookiebar2/CookieBar;-><init>(Landroid/app/Activity;Lorg/aviran/cookiebar2/CookieBar$Params;)V

    return-void
.end method

.method static synthetic access$100(Lorg/aviran/cookiebar2/CookieBar;)V
    .locals 0

    .line 26
    invoke-direct {p0}, Lorg/aviran/cookiebar2/CookieBar;->show()V

    return-void
.end method

.method private addCookie(Landroid/view/ViewGroup;Lorg/aviran/cookiebar2/Cookie;)V
    .locals 4

    .line 84
    invoke-virtual {p2}, Lorg/aviran/cookiebar2/Cookie;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    if-eqz v0, :cond_0

    return-void

    .line 89
    :cond_0
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_2

    .line 91
    invoke-virtual {p1, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    .line 92
    instance-of v3, v2, Lorg/aviran/cookiebar2/Cookie;

    if-eqz v3, :cond_1

    .line 93
    check-cast v2, Lorg/aviran/cookiebar2/Cookie;

    new-instance v0, Lorg/aviran/cookiebar2/CookieBar$1;

    invoke-direct {v0, p0, p1, p2}, Lorg/aviran/cookiebar2/CookieBar$1;-><init>(Lorg/aviran/cookiebar2/CookieBar;Landroid/view/ViewGroup;Lorg/aviran/cookiebar2/Cookie;)V

    invoke-virtual {v2, v0}, Lorg/aviran/cookiebar2/Cookie;->dismiss(Lorg/aviran/cookiebar2/Cookie$CookieBarDismissListener;)V

    return-void

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 103
    :cond_2
    invoke-virtual {p1, p2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    return-void
.end method

.method public static build(Landroid/app/Activity;)Lorg/aviran/cookiebar2/CookieBar$Builder;
    .locals 1

    .line 31
    new-instance v0, Lorg/aviran/cookiebar2/CookieBar$Builder;

    invoke-direct {v0, p0}, Lorg/aviran/cookiebar2/CookieBar$Builder;-><init>(Landroid/app/Activity;)V

    return-object v0
.end method

.method private dismiss()V
    .locals 2

    .line 64
    iget-object v0, p0, Lorg/aviran/cookiebar2/CookieBar;->context:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    const v1, 0x1020002

    .line 65
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/view/ViewGroup;

    .line 67
    invoke-direct {p0, v0}, Lorg/aviran/cookiebar2/CookieBar;->removeFromParent(Landroid/view/ViewGroup;)V

    .line 68
    invoke-direct {p0, v1}, Lorg/aviran/cookiebar2/CookieBar;->removeFromParent(Landroid/view/ViewGroup;)V

    return-void
.end method

.method public static dismiss(Landroid/app/Activity;)V
    .locals 2

    .line 35
    new-instance v0, Lorg/aviran/cookiebar2/CookieBar;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lorg/aviran/cookiebar2/CookieBar;-><init>(Landroid/app/Activity;Lorg/aviran/cookiebar2/CookieBar$Params;)V

    return-void
.end method

.method private removeFromParent(Landroid/view/ViewGroup;)V
    .locals 4

    .line 72
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    .line 74
    invoke-virtual {p1, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    .line 75
    instance-of v3, v2, Lorg/aviran/cookiebar2/Cookie;

    if-eqz v3, :cond_0

    .line 76
    check-cast v2, Lorg/aviran/cookiebar2/Cookie;

    invoke-virtual {v2}, Lorg/aviran/cookiebar2/Cookie;->dismiss()V

    return-void

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method private show()V
    .locals 4

    .line 52
    iget-object v0, p0, Lorg/aviran/cookiebar2/CookieBar;->cookieView:Lorg/aviran/cookiebar2/Cookie;

    if-eqz v0, :cond_1

    .line 53
    iget-object v0, p0, Lorg/aviran/cookiebar2/CookieBar;->context:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    const v1, 0x1020002

    .line 54
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/view/ViewGroup;

    .line 55
    iget-object v2, p0, Lorg/aviran/cookiebar2/CookieBar;->cookieView:Lorg/aviran/cookiebar2/Cookie;

    invoke-virtual {v2}, Lorg/aviran/cookiebar2/Cookie;->getParent()Landroid/view/ViewParent;

    move-result-object v2

    if-nez v2, :cond_1

    .line 56
    iget-object v2, p0, Lorg/aviran/cookiebar2/CookieBar;->cookieView:Lorg/aviran/cookiebar2/Cookie;

    invoke-virtual {v2}, Lorg/aviran/cookiebar2/Cookie;->getLayoutGravity()I

    move-result v2

    const/16 v3, 0x50

    if-ne v2, v3, :cond_0

    move-object v0, v1

    .line 58
    :cond_0
    iget-object v1, p0, Lorg/aviran/cookiebar2/CookieBar;->cookieView:Lorg/aviran/cookiebar2/Cookie;

    invoke-direct {p0, v0, v1}, Lorg/aviran/cookiebar2/CookieBar;->addCookie(Landroid/view/ViewGroup;Lorg/aviran/cookiebar2/Cookie;)V

    :cond_1
    return-void
.end method
