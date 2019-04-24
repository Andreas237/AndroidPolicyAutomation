.class public Lcom/shopkick/app/account/AgeVerificationController$VerifyAgeClickListener;
.super Ljava/lang/Object;
.source "AgeVerificationController.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/account/AgeVerificationController;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "VerifyAgeClickListener"
.end annotation


# instance fields
.field private ageVerificationController:Lcom/shopkick/app/account/AgeVerificationController;

.field private tileClickListener:Landroid/view/View$OnClickListener;

.field private tileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;


# direct methods
.method public constructor <init>(Lcom/shopkick/app/account/AgeVerificationController;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;Landroid/view/View$OnClickListener;)V
    .locals 0

    .line 373
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 374
    iput-object p1, p0, Lcom/shopkick/app/account/AgeVerificationController$VerifyAgeClickListener;->ageVerificationController:Lcom/shopkick/app/account/AgeVerificationController;

    .line 375
    iput-object p2, p0, Lcom/shopkick/app/account/AgeVerificationController$VerifyAgeClickListener;->tileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    .line 376
    iput-object p3, p0, Lcom/shopkick/app/account/AgeVerificationController$VerifyAgeClickListener;->tileClickListener:Landroid/view/View$OnClickListener;

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4

    .line 381
    iget-object v0, p0, Lcom/shopkick/app/account/AgeVerificationController$VerifyAgeClickListener;->ageVerificationController:Lcom/shopkick/app/account/AgeVerificationController;

    iget-object v1, p0, Lcom/shopkick/app/account/AgeVerificationController$VerifyAgeClickListener;->tileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget-object v2, p0, Lcom/shopkick/app/account/AgeVerificationController$VerifyAgeClickListener;->tileClickListener:Landroid/view/View$OnClickListener;

    const/4 v3, 0x0

    invoke-virtual {v0, v1, p1, v2, v3}, Lcom/shopkick/app/account/AgeVerificationController;->maybeVerifyAge(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;Landroid/view/View;Landroid/view/View$OnClickListener;Landroid/content/DialogInterface$OnDismissListener;)V

    return-void
.end method
