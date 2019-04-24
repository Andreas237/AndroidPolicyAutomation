.class Lcom/shopkick/app/launch/FirstUseV2InviteScreen$1;
.super Ljava/lang/Object;
.source "FirstUseV2InviteScreen.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/launch/FirstUseV2InviteScreen;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/app/launch/FirstUseV2InviteScreen;


# direct methods
.method constructor <init>(Lcom/shopkick/app/launch/FirstUseV2InviteScreen;)V
    .locals 0

    .line 118
    iput-object p1, p0, Lcom/shopkick/app/launch/FirstUseV2InviteScreen$1;->this$0:Lcom/shopkick/app/launch/FirstUseV2InviteScreen;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 121
    iget-object p1, p0, Lcom/shopkick/app/launch/FirstUseV2InviteScreen$1;->this$0:Lcom/shopkick/app/launch/FirstUseV2InviteScreen;

    invoke-static {p1}, Lcom/shopkick/app/launch/FirstUseV2InviteScreen;->access$100(Lcom/shopkick/app/launch/FirstUseV2InviteScreen;)Lcom/shopkick/app/url/URLDispatcherFactory;

    move-result-object p1

    invoke-virtual {p1}, Lcom/shopkick/app/url/URLDispatcherFactory;->dispatcher()Lcom/shopkick/app/url/URLDispatcher;

    move-result-object p1

    iget-object v0, p0, Lcom/shopkick/app/launch/FirstUseV2InviteScreen$1;->this$0:Lcom/shopkick/app/launch/FirstUseV2InviteScreen;

    invoke-static {v0}, Lcom/shopkick/app/launch/FirstUseV2InviteScreen;->access$000(Lcom/shopkick/app/launch/FirstUseV2InviteScreen;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/shopkick/app/url/URLDispatcher;->dispatchURL(Ljava/lang/String;)Z

    return-void
.end method
