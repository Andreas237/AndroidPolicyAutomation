.class Lcom/shopkick/app/overlays/scans/ScanMissionCompletedOverlay$DismissCallback;
.super Ljava/lang/Object;
.source "ScanMissionCompletedOverlay.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/overlays/scans/ScanMissionCompletedOverlay;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "DismissCallback"
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/app/overlays/scans/ScanMissionCompletedOverlay;


# direct methods
.method private constructor <init>(Lcom/shopkick/app/overlays/scans/ScanMissionCompletedOverlay;)V
    .locals 0

    .line 78
    iput-object p1, p0, Lcom/shopkick/app/overlays/scans/ScanMissionCompletedOverlay$DismissCallback;->this$0:Lcom/shopkick/app/overlays/scans/ScanMissionCompletedOverlay;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/shopkick/app/overlays/scans/ScanMissionCompletedOverlay;Lcom/shopkick/app/overlays/scans/ScanMissionCompletedOverlay$1;)V
    .locals 0

    .line 78
    invoke-direct {p0, p1}, Lcom/shopkick/app/overlays/scans/ScanMissionCompletedOverlay$DismissCallback;-><init>(Lcom/shopkick/app/overlays/scans/ScanMissionCompletedOverlay;)V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 0

    .line 81
    iget-object p1, p0, Lcom/shopkick/app/overlays/scans/ScanMissionCompletedOverlay$DismissCallback;->this$0:Lcom/shopkick/app/overlays/scans/ScanMissionCompletedOverlay;

    invoke-virtual {p1}, Lcom/shopkick/app/overlays/scans/ScanMissionCompletedOverlay;->dismiss()V

    return-void
.end method
