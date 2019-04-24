.class public final Lcom/ibotta/android/mvp/ui/view/grid/GridCardView$ViewModel;
.super Ljava/lang/Object;
.source "GridCardView.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/mvp/ui/view/grid/GridCardView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "ViewModel"
.end annotation


# instance fields
.field private final gridCardClickListener:Landroid/view/View$OnClickListener;

.field private final iconUrl:Ljava/lang/String;

.field private final message:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Landroid/view/View$OnClickListener;)V
    .locals 0

    .line 66
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 67
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/grid/GridCardView$ViewModel;->message:Ljava/lang/String;

    .line 68
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/view/grid/GridCardView$ViewModel;->iconUrl:Ljava/lang/String;

    .line 69
    iput-object p3, p0, Lcom/ibotta/android/mvp/ui/view/grid/GridCardView$ViewModel;->gridCardClickListener:Landroid/view/View$OnClickListener;

    return-void
.end method


# virtual methods
.method public getGridCardClickListener()Landroid/view/View$OnClickListener;
    .locals 1

    .line 81
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/grid/GridCardView$ViewModel;->gridCardClickListener:Landroid/view/View$OnClickListener;

    return-object v0
.end method

.method public getIconUrl()Ljava/lang/String;
    .locals 1

    .line 77
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/grid/GridCardView$ViewModel;->iconUrl:Ljava/lang/String;

    return-object v0
.end method

.method public getMessage()Ljava/lang/String;
    .locals 1

    .line 73
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/grid/GridCardView$ViewModel;->message:Ljava/lang/String;

    return-object v0
.end method
