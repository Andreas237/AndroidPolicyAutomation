.class Lorg/aviran/cookiebar2/CookieBar$1;
.super Ljava/lang/Object;
.source "CookieBar.java"

# interfaces
.implements Lorg/aviran/cookiebar2/Cookie$CookieBarDismissListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lorg/aviran/cookiebar2/CookieBar;->addCookie(Landroid/view/ViewGroup;Lorg/aviran/cookiebar2/Cookie;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lorg/aviran/cookiebar2/CookieBar;

.field final synthetic val$cookie:Lorg/aviran/cookiebar2/Cookie;

.field final synthetic val$parent:Landroid/view/ViewGroup;


# direct methods
.method constructor <init>(Lorg/aviran/cookiebar2/CookieBar;Landroid/view/ViewGroup;Lorg/aviran/cookiebar2/Cookie;)V
    .locals 0

    .line 93
    iput-object p1, p0, Lorg/aviran/cookiebar2/CookieBar$1;->this$0:Lorg/aviran/cookiebar2/CookieBar;

    iput-object p2, p0, Lorg/aviran/cookiebar2/CookieBar$1;->val$parent:Landroid/view/ViewGroup;

    iput-object p3, p0, Lorg/aviran/cookiebar2/CookieBar$1;->val$cookie:Lorg/aviran/cookiebar2/Cookie;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onDismiss()V
    .locals 2

    .line 96
    iget-object v0, p0, Lorg/aviran/cookiebar2/CookieBar$1;->val$parent:Landroid/view/ViewGroup;

    iget-object v1, p0, Lorg/aviran/cookiebar2/CookieBar$1;->val$cookie:Lorg/aviran/cookiebar2/Cookie;

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    return-void
.end method
