.class Lcom/shopkick/sdk/campaign/CampaignOverlayActivity$2;
.super Ljava/lang/Object;
.source "CampaignOverlayActivity.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/sdk/campaign/CampaignOverlayActivity;->initOverlay(Landroid/content/Intent;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/sdk/campaign/CampaignOverlayActivity;

.field final synthetic val$intent:Landroid/content/Intent;


# direct methods
.method constructor <init>(Lcom/shopkick/sdk/campaign/CampaignOverlayActivity;Landroid/content/Intent;)V
    .locals 0

    .line 148
    iput-object p1, p0, Lcom/shopkick/sdk/campaign/CampaignOverlayActivity$2;->this$0:Lcom/shopkick/sdk/campaign/CampaignOverlayActivity;

    iput-object p2, p0, Lcom/shopkick/sdk/campaign/CampaignOverlayActivity$2;->val$intent:Landroid/content/Intent;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 151
    iget-object p1, p0, Lcom/shopkick/sdk/campaign/CampaignOverlayActivity$2;->this$0:Lcom/shopkick/sdk/campaign/CampaignOverlayActivity;

    iget-object v0, p0, Lcom/shopkick/sdk/campaign/CampaignOverlayActivity$2;->val$intent:Landroid/content/Intent;

    invoke-static {p1, v0}, Lcom/shopkick/sdk/campaign/CampaignOverlayActivity;->access$100(Lcom/shopkick/sdk/campaign/CampaignOverlayActivity;Landroid/content/Intent;)V

    return-void
.end method
