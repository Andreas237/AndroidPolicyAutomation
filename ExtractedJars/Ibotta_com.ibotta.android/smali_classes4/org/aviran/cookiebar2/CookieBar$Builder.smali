.class public Lorg/aviran/cookiebar2/CookieBar$Builder;
.super Ljava/lang/Object;
.source "CookieBar.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/aviran/cookiebar2/CookieBar;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Builder"
.end annotation


# instance fields
.field public final context:Landroid/app/Activity;

.field private final params:Lorg/aviran/cookiebar2/CookieBar$Params;


# direct methods
.method public constructor <init>(Landroid/app/Activity;)V
    .locals 1

    .line 115
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 108
    new-instance v0, Lorg/aviran/cookiebar2/CookieBar$Params;

    invoke-direct {v0}, Lorg/aviran/cookiebar2/CookieBar$Params;-><init>()V

    iput-object v0, p0, Lorg/aviran/cookiebar2/CookieBar$Builder;->params:Lorg/aviran/cookiebar2/CookieBar$Params;

    .line 116
    iput-object p1, p0, Lorg/aviran/cookiebar2/CookieBar$Builder;->context:Landroid/app/Activity;

    return-void
.end method


# virtual methods
.method public create()Lorg/aviran/cookiebar2/CookieBar;
    .locals 4

    .line 197
    new-instance v0, Lorg/aviran/cookiebar2/CookieBar;

    iget-object v1, p0, Lorg/aviran/cookiebar2/CookieBar$Builder;->context:Landroid/app/Activity;

    iget-object v2, p0, Lorg/aviran/cookiebar2/CookieBar$Builder;->params:Lorg/aviran/cookiebar2/CookieBar$Params;

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Lorg/aviran/cookiebar2/CookieBar;-><init>(Landroid/app/Activity;Lorg/aviran/cookiebar2/CookieBar$Params;Lorg/aviran/cookiebar2/CookieBar$1;)V

    return-object v0
.end method

.method public setAction(Ljava/lang/String;Lorg/aviran/cookiebar2/OnActionClickListener;)Lorg/aviran/cookiebar2/CookieBar$Builder;
    .locals 1

    .line 170
    iget-object v0, p0, Lorg/aviran/cookiebar2/CookieBar$Builder;->params:Lorg/aviran/cookiebar2/CookieBar$Params;

    iput-object p1, v0, Lorg/aviran/cookiebar2/CookieBar$Params;->action:Ljava/lang/String;

    .line 171
    iput-object p2, v0, Lorg/aviran/cookiebar2/CookieBar$Params;->onActionClickListener:Lorg/aviran/cookiebar2/OnActionClickListener;

    return-object p0
.end method

.method public setActionColor(I)Lorg/aviran/cookiebar2/CookieBar$Builder;
    .locals 1
    .param p1    # I
        .annotation build Landroid/support/annotation/ColorRes;
        .end annotation
    .end param

    .line 165
    iget-object v0, p0, Lorg/aviran/cookiebar2/CookieBar$Builder;->params:Lorg/aviran/cookiebar2/CookieBar$Params;

    iput p1, v0, Lorg/aviran/cookiebar2/CookieBar$Params;->actionColor:I

    return-object p0
.end method

.method public setBackgroundColor(I)Lorg/aviran/cookiebar2/CookieBar$Builder;
    .locals 1
    .param p1    # I
        .annotation build Landroid/support/annotation/ColorRes;
        .end annotation
    .end param

    .line 160
    iget-object v0, p0, Lorg/aviran/cookiebar2/CookieBar$Builder;->params:Lorg/aviran/cookiebar2/CookieBar$Params;

    iput p1, v0, Lorg/aviran/cookiebar2/CookieBar$Params;->backgroundColor:I

    return-object p0
.end method

.method public setCustomView(Landroid/view/View;)Lorg/aviran/cookiebar2/CookieBar$Builder;
    .locals 1

    .line 192
    iget-object v0, p0, Lorg/aviran/cookiebar2/CookieBar$Builder;->params:Lorg/aviran/cookiebar2/CookieBar$Params;

    iput-object p1, v0, Lorg/aviran/cookiebar2/CookieBar$Params;->customView:Landroid/view/View;

    return-object p0
.end method

.method public setDuration(J)Lorg/aviran/cookiebar2/CookieBar$Builder;
    .locals 1

    .line 145
    iget-object v0, p0, Lorg/aviran/cookiebar2/CookieBar$Builder;->params:Lorg/aviran/cookiebar2/CookieBar$Params;

    iput-wide p1, v0, Lorg/aviran/cookiebar2/CookieBar$Params;->duration:J

    return-object p0
.end method

.method public setMessage(Ljava/lang/String;)Lorg/aviran/cookiebar2/CookieBar$Builder;
    .locals 1

    .line 135
    iget-object v0, p0, Lorg/aviran/cookiebar2/CookieBar$Builder;->params:Lorg/aviran/cookiebar2/CookieBar$Params;

    iput-object p1, v0, Lorg/aviran/cookiebar2/CookieBar$Params;->message:Ljava/lang/String;

    return-object p0
.end method

.method public setMessageColor(I)Lorg/aviran/cookiebar2/CookieBar$Builder;
    .locals 1
    .param p1    # I
        .annotation build Landroid/support/annotation/ColorRes;
        .end annotation
    .end param

    .line 155
    iget-object v0, p0, Lorg/aviran/cookiebar2/CookieBar$Builder;->params:Lorg/aviran/cookiebar2/CookieBar$Params;

    iput p1, v0, Lorg/aviran/cookiebar2/CookieBar$Params;->messageColor:I

    return-object p0
.end method

.method public setTitle(Ljava/lang/String;)Lorg/aviran/cookiebar2/CookieBar$Builder;
    .locals 1

    .line 125
    iget-object v0, p0, Lorg/aviran/cookiebar2/CookieBar$Builder;->params:Lorg/aviran/cookiebar2/CookieBar$Params;

    iput-object p1, v0, Lorg/aviran/cookiebar2/CookieBar$Params;->title:Ljava/lang/String;

    return-object p0
.end method

.method public setTitleColor(I)Lorg/aviran/cookiebar2/CookieBar$Builder;
    .locals 1
    .param p1    # I
        .annotation build Landroid/support/annotation/ColorRes;
        .end annotation
    .end param

    .line 150
    iget-object v0, p0, Lorg/aviran/cookiebar2/CookieBar$Builder;->params:Lorg/aviran/cookiebar2/CookieBar$Params;

    iput p1, v0, Lorg/aviran/cookiebar2/CookieBar$Params;->titleColor:I

    return-object p0
.end method

.method public show()Lorg/aviran/cookiebar2/CookieBar;
    .locals 1

    .line 201
    invoke-virtual {p0}, Lorg/aviran/cookiebar2/CookieBar$Builder;->create()Lorg/aviran/cookiebar2/CookieBar;

    move-result-object v0

    .line 202
    invoke-static {v0}, Lorg/aviran/cookiebar2/CookieBar;->access$100(Lorg/aviran/cookiebar2/CookieBar;)V

    return-object v0
.end method
