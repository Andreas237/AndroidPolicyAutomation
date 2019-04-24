.class Lcom/shopkick/app/launch/FirstUseV2InviteScreen$2;
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

    .line 125
    iput-object p1, p0, Lcom/shopkick/app/launch/FirstUseV2InviteScreen$2;->this$0:Lcom/shopkick/app/launch/FirstUseV2InviteScreen;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 0

    .line 128
    iget-object p1, p0, Lcom/shopkick/app/launch/FirstUseV2InviteScreen$2;->this$0:Lcom/shopkick/app/launch/FirstUseV2InviteScreen;

    invoke-static {p1}, Lcom/shopkick/app/launch/FirstUseV2InviteScreen;->access$200(Lcom/shopkick/app/launch/FirstUseV2InviteScreen;)Lcom/shopkick/app/launch/FirstUseControllerV2;

    move-result-object p1

    invoke-virtual {p1}, Lcom/shopkick/app/launch/FirstUseControllerV2;->gotoNextScreen()Z

    return-void
.end method
