.class public final synthetic Lcom/shopkick/app/debug/-$$Lambda$GPSCheckinDebugScreen$3YO3a7n1zgY3t6LoSxdWojLmEmk;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;


# instance fields
.field private final synthetic f$0:Lcom/shopkick/app/debug/GPSCheckinDebugScreen;

.field private final synthetic f$1:Ljava/util/ArrayList;


# direct methods
.method public synthetic constructor <init>(Lcom/shopkick/app/debug/GPSCheckinDebugScreen;Ljava/util/ArrayList;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/shopkick/app/debug/-$$Lambda$GPSCheckinDebugScreen$3YO3a7n1zgY3t6LoSxdWojLmEmk;->f$0:Lcom/shopkick/app/debug/GPSCheckinDebugScreen;

    iput-object p2, p0, Lcom/shopkick/app/debug/-$$Lambda$GPSCheckinDebugScreen$3YO3a7n1zgY3t6LoSxdWojLmEmk;->f$1:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method public final onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 7

    iget-object v0, p0, Lcom/shopkick/app/debug/-$$Lambda$GPSCheckinDebugScreen$3YO3a7n1zgY3t6LoSxdWojLmEmk;->f$0:Lcom/shopkick/app/debug/GPSCheckinDebugScreen;

    iget-object v1, p0, Lcom/shopkick/app/debug/-$$Lambda$GPSCheckinDebugScreen$3YO3a7n1zgY3t6LoSxdWojLmEmk;->f$1:Ljava/util/ArrayList;

    move-object v2, p1

    move-object v3, p2

    move v4, p3

    move-wide v5, p4

    invoke-static/range {v0 .. v6}, Lcom/shopkick/app/debug/GPSCheckinDebugScreen;->lambda$createScreen$69(Lcom/shopkick/app/debug/GPSCheckinDebugScreen;Ljava/util/ArrayList;Landroid/widget/AdapterView;Landroid/view/View;IJ)V

    return-void
.end method
