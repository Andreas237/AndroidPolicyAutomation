.class public Lcom/shopkick/app/urlhandlers/CloseHandler;
.super Lcom/shopkick/app/url/URLHandler;
.source "CloseHandler.java"


# static fields
.field public static final DISPATCHER_KEY:Ljava/lang/String; = "close"


# instance fields
.field private appActivityManager:Lcom/shopkick/app/application/AppActivityManager;


# direct methods
.method public constructor <init>(Lcom/shopkick/app/application/AppActivityManager;)V
    .locals 0

    .line 14
    invoke-direct {p0}, Lcom/shopkick/app/url/URLHandler;-><init>()V

    .line 15
    iput-object p1, p0, Lcom/shopkick/app/urlhandlers/CloseHandler;->appActivityManager:Lcom/shopkick/app/application/AppActivityManager;

    return-void
.end method


# virtual methods
.method public execute()V
    .locals 2

    .line 20
    iget-object v0, p0, Lcom/shopkick/app/urlhandlers/CloseHandler;->appActivityManager:Lcom/shopkick/app/application/AppActivityManager;

    invoke-virtual {v0}, Lcom/shopkick/app/application/AppActivityManager;->getCurrentActivity()Lcom/shopkick/app/activities/BaseActivity;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 21
    instance-of v1, v0, Lcom/shopkick/app/activities/HomeActivity;

    if-eqz v1, :cond_0

    goto :goto_0

    .line 25
    :cond_0
    invoke-virtual {v0}, Landroid/app/Activity;->finish()V

    return-void

    :cond_1
    :goto_0
    return-void
.end method
