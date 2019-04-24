.class Lcom/huawei/feedback/ui/j$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/feedback/ui/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "a"
.end annotation


# instance fields
.field private a:Landroid/widget/TextView;

.field private b:Landroid/widget/TextView;

.field private c:Landroid/widget/ImageView;

.field private d:Landroid/widget/ImageView;


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 255
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/huawei/feedback/ui/k;)V
    .locals 0

    .line 255
    invoke-direct {p0}, Lcom/huawei/feedback/ui/j$a;-><init>()V

    return-void
.end method

.method static synthetic a(Lcom/huawei/feedback/ui/j$a;)Landroid/widget/ImageView;
    .locals 1

    .line 255
    iget-object v0, p0, Lcom/huawei/feedback/ui/j$a;->d:Landroid/widget/ImageView;

    return-object v0
.end method

.method static synthetic a(Lcom/huawei/feedback/ui/j$a;Landroid/widget/ImageView;)Landroid/widget/ImageView;
    .locals 0

    .line 255
    iput-object p1, p0, Lcom/huawei/feedback/ui/j$a;->c:Landroid/widget/ImageView;

    return-object p1
.end method

.method static synthetic a(Lcom/huawei/feedback/ui/j$a;Landroid/widget/TextView;)Landroid/widget/TextView;
    .locals 0

    .line 255
    iput-object p1, p0, Lcom/huawei/feedback/ui/j$a;->a:Landroid/widget/TextView;

    return-object p1
.end method

.method static synthetic b(Lcom/huawei/feedback/ui/j$a;Landroid/widget/ImageView;)Landroid/widget/ImageView;
    .locals 0

    .line 255
    iput-object p1, p0, Lcom/huawei/feedback/ui/j$a;->d:Landroid/widget/ImageView;

    return-object p1
.end method

.method static synthetic b(Lcom/huawei/feedback/ui/j$a;)Landroid/widget/TextView;
    .locals 1

    .line 255
    iget-object v0, p0, Lcom/huawei/feedback/ui/j$a;->a:Landroid/widget/TextView;

    return-object v0
.end method

.method static synthetic b(Lcom/huawei/feedback/ui/j$a;Landroid/widget/TextView;)Landroid/widget/TextView;
    .locals 0

    .line 255
    iput-object p1, p0, Lcom/huawei/feedback/ui/j$a;->b:Landroid/widget/TextView;

    return-object p1
.end method

.method static synthetic c(Lcom/huawei/feedback/ui/j$a;)Landroid/widget/TextView;
    .locals 1

    .line 255
    iget-object v0, p0, Lcom/huawei/feedback/ui/j$a;->b:Landroid/widget/TextView;

    return-object v0
.end method

.method static synthetic d(Lcom/huawei/feedback/ui/j$a;)Landroid/widget/ImageView;
    .locals 1

    .line 255
    iget-object v0, p0, Lcom/huawei/feedback/ui/j$a;->c:Landroid/widget/ImageView;

    return-object v0
.end method
