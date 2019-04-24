.class Lcom/ibotta/android/view/common/TextCaptureFlyUpPageCreator$TextCaptureViewHolder;
.super Lcom/ibotta/android/fragment/dialog/flyup/FlyUpViewHolder;
.source "TextCaptureFlyUpPageCreator.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/view/common/TextCaptureFlyUpPageCreator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "TextCaptureViewHolder"
.end annotation


# instance fields
.field private etInput:Landroid/widget/EditText;

.field private tvInstructions:Landroid/widget/TextView;

.field private tvLegal:Landroid/widget/TextView;


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 138
    invoke-direct {p0}, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpViewHolder;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/ibotta/android/view/common/TextCaptureFlyUpPageCreator$1;)V
    .locals 0

    .line 138
    invoke-direct {p0}, Lcom/ibotta/android/view/common/TextCaptureFlyUpPageCreator$TextCaptureViewHolder;-><init>()V

    return-void
.end method

.method static synthetic access$100(Lcom/ibotta/android/view/common/TextCaptureFlyUpPageCreator$TextCaptureViewHolder;)Landroid/widget/TextView;
    .locals 0

    .line 138
    iget-object p0, p0, Lcom/ibotta/android/view/common/TextCaptureFlyUpPageCreator$TextCaptureViewHolder;->tvInstructions:Landroid/widget/TextView;

    return-object p0
.end method

.method static synthetic access$102(Lcom/ibotta/android/view/common/TextCaptureFlyUpPageCreator$TextCaptureViewHolder;Landroid/widget/TextView;)Landroid/widget/TextView;
    .locals 0

    .line 138
    iput-object p1, p0, Lcom/ibotta/android/view/common/TextCaptureFlyUpPageCreator$TextCaptureViewHolder;->tvInstructions:Landroid/widget/TextView;

    return-object p1
.end method

.method static synthetic access$200(Lcom/ibotta/android/view/common/TextCaptureFlyUpPageCreator$TextCaptureViewHolder;)Landroid/widget/TextView;
    .locals 0

    .line 138
    iget-object p0, p0, Lcom/ibotta/android/view/common/TextCaptureFlyUpPageCreator$TextCaptureViewHolder;->tvLegal:Landroid/widget/TextView;

    return-object p0
.end method

.method static synthetic access$202(Lcom/ibotta/android/view/common/TextCaptureFlyUpPageCreator$TextCaptureViewHolder;Landroid/widget/TextView;)Landroid/widget/TextView;
    .locals 0

    .line 138
    iput-object p1, p0, Lcom/ibotta/android/view/common/TextCaptureFlyUpPageCreator$TextCaptureViewHolder;->tvLegal:Landroid/widget/TextView;

    return-object p1
.end method

.method static synthetic access$300(Lcom/ibotta/android/view/common/TextCaptureFlyUpPageCreator$TextCaptureViewHolder;)Landroid/widget/EditText;
    .locals 0

    .line 138
    iget-object p0, p0, Lcom/ibotta/android/view/common/TextCaptureFlyUpPageCreator$TextCaptureViewHolder;->etInput:Landroid/widget/EditText;

    return-object p0
.end method

.method static synthetic access$302(Lcom/ibotta/android/view/common/TextCaptureFlyUpPageCreator$TextCaptureViewHolder;Landroid/widget/EditText;)Landroid/widget/EditText;
    .locals 0

    .line 138
    iput-object p1, p0, Lcom/ibotta/android/view/common/TextCaptureFlyUpPageCreator$TextCaptureViewHolder;->etInput:Landroid/widget/EditText;

    return-object p1
.end method
