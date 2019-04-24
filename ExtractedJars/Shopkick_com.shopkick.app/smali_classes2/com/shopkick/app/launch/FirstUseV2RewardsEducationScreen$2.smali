.class Lcom/shopkick/app/launch/FirstUseV2RewardsEducationScreen$2;
.super Ljava/lang/Object;
.source "FirstUseV2RewardsEducationScreen.java"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/app/launch/FirstUseV2RewardsEducationScreen;->showErrorAlert(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/app/launch/FirstUseV2RewardsEducationScreen;


# direct methods
.method constructor <init>(Lcom/shopkick/app/launch/FirstUseV2RewardsEducationScreen;)V
    .locals 0

    .line 141
    iput-object p1, p0, Lcom/shopkick/app/launch/FirstUseV2RewardsEducationScreen$2;->this$0:Lcom/shopkick/app/launch/FirstUseV2RewardsEducationScreen;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 0

    .line 143
    invoke-interface {p1}, Landroid/content/DialogInterface;->cancel()V

    .line 144
    iget-object p1, p0, Lcom/shopkick/app/launch/FirstUseV2RewardsEducationScreen$2;->this$0:Lcom/shopkick/app/launch/FirstUseV2RewardsEducationScreen;

    invoke-static {p1}, Lcom/shopkick/app/launch/FirstUseV2RewardsEducationScreen;->access$100(Lcom/shopkick/app/launch/FirstUseV2RewardsEducationScreen;)V

    return-void
.end method
