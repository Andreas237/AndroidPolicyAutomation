.class public Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment$FlyUpControlHolder;
.super Ljava/lang/Object;
.source "FlyUpDialogFragment.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "FlyUpControlHolder"
.end annotation


# instance fields
.field private final flContainer:Landroid/widget/FrameLayout;

.field private final ivImage:Landroid/widget/ImageView;

.field private final tvTextView:Landroid/widget/TextView;


# direct methods
.method private constructor <init>(Landroid/widget/FrameLayout;Landroid/widget/TextView;Landroid/widget/ImageView;)V
    .locals 0

    .line 392
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 393
    iput-object p1, p0, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment$FlyUpControlHolder;->flContainer:Landroid/widget/FrameLayout;

    .line 394
    iput-object p2, p0, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment$FlyUpControlHolder;->tvTextView:Landroid/widget/TextView;

    .line 395
    iput-object p3, p0, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment$FlyUpControlHolder;->ivImage:Landroid/widget/ImageView;

    return-void
.end method

.method synthetic constructor <init>(Landroid/widget/FrameLayout;Landroid/widget/TextView;Landroid/widget/ImageView;Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment$1;)V
    .locals 0

    .line 387
    invoke-direct {p0, p1, p2, p3}, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment$FlyUpControlHolder;-><init>(Landroid/widget/FrameLayout;Landroid/widget/TextView;Landroid/widget/ImageView;)V

    return-void
.end method


# virtual methods
.method public getContainer()Landroid/widget/FrameLayout;
    .locals 1

    .line 399
    iget-object v0, p0, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment$FlyUpControlHolder;->flContainer:Landroid/widget/FrameLayout;

    return-object v0
.end method

.method public getImageView()Landroid/widget/ImageView;
    .locals 1

    .line 407
    iget-object v0, p0, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment$FlyUpControlHolder;->ivImage:Landroid/widget/ImageView;

    return-object v0
.end method

.method public getTextView()Landroid/widget/TextView;
    .locals 1

    .line 403
    iget-object v0, p0, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment$FlyUpControlHolder;->tvTextView:Landroid/widget/TextView;

    return-object v0
.end method
