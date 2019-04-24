.class Lo/ewj$e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/ewj;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "e"
.end annotation


# instance fields
.field private a:Landroid/widget/TextView;

.field private d:Landroid/view/View;


# direct methods
.method constructor <init>()V
    .locals 0

    .line 113
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic a(Lo/ewj$e;Landroid/view/View;)Landroid/view/View;
    .locals 0

    .line 113
    iput-object p1, p0, Lo/ewj$e;->d:Landroid/view/View;

    return-object p1
.end method

.method static synthetic d(Lo/ewj$e;)Landroid/view/View;
    .locals 1

    .line 113
    iget-object v0, p0, Lo/ewj$e;->d:Landroid/view/View;

    return-object v0
.end method

.method static synthetic e(Lo/ewj$e;)Landroid/widget/TextView;
    .locals 1

    .line 113
    iget-object v0, p0, Lo/ewj$e;->a:Landroid/widget/TextView;

    return-object v0
.end method

.method static synthetic e(Lo/ewj$e;Landroid/widget/TextView;)Landroid/widget/TextView;
    .locals 0

    .line 113
    iput-object p1, p0, Lo/ewj$e;->a:Landroid/widget/TextView;

    return-object p1
.end method
