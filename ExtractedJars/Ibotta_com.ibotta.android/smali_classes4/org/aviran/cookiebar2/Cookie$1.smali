.class Lorg/aviran/cookiebar2/Cookie$1;
.super Ljava/lang/Object;
.source "Cookie.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lorg/aviran/cookiebar2/Cookie;->setParams(Lorg/aviran/cookiebar2/CookieBar$Params;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lorg/aviran/cookiebar2/Cookie;

.field final synthetic val$params:Lorg/aviran/cookiebar2/CookieBar$Params;


# direct methods
.method constructor <init>(Lorg/aviran/cookiebar2/Cookie;Lorg/aviran/cookiebar2/CookieBar$Params;)V
    .locals 0

    .line 153
    iput-object p1, p0, Lorg/aviran/cookiebar2/Cookie$1;->this$0:Lorg/aviran/cookiebar2/Cookie;

    iput-object p2, p0, Lorg/aviran/cookiebar2/Cookie$1;->val$params:Lorg/aviran/cookiebar2/CookieBar$Params;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 0

    .line 156
    iget-object p1, p0, Lorg/aviran/cookiebar2/Cookie$1;->val$params:Lorg/aviran/cookiebar2/CookieBar$Params;

    iget-object p1, p1, Lorg/aviran/cookiebar2/CookieBar$Params;->onActionClickListener:Lorg/aviran/cookiebar2/OnActionClickListener;

    invoke-interface {p1}, Lorg/aviran/cookiebar2/OnActionClickListener;->onClick()V

    .line 157
    iget-object p1, p0, Lorg/aviran/cookiebar2/Cookie$1;->this$0:Lorg/aviran/cookiebar2/Cookie;

    invoke-virtual {p1}, Lorg/aviran/cookiebar2/Cookie;->dismiss()V

    return-void
.end method
