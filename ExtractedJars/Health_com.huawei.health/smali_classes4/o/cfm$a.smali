.class Lo/cfm$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/cfm;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "a"
.end annotation


# instance fields
.field private c:Landroid/widget/ImageView;

.field private d:Landroid/widget/TextView;

.field private e:Landroid/view/View;


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 224
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lo/cfm$4;)V
    .locals 0

    .line 224
    invoke-direct {p0}, Lo/cfm$a;-><init>()V

    return-void
.end method

.method static synthetic a(Lo/cfm$a;Landroid/widget/TextView;)Landroid/widget/TextView;
    .locals 0

    .line 224
    iput-object p1, p0, Lo/cfm$a;->d:Landroid/widget/TextView;

    return-object p1
.end method

.method static synthetic b(Lo/cfm$a;)Landroid/widget/ImageView;
    .locals 1

    .line 224
    iget-object v0, p0, Lo/cfm$a;->c:Landroid/widget/ImageView;

    return-object v0
.end method

.method static synthetic c(Lo/cfm$a;Landroid/view/View;)Landroid/view/View;
    .locals 0

    .line 224
    iput-object p1, p0, Lo/cfm$a;->e:Landroid/view/View;

    return-object p1
.end method

.method static synthetic c(Lo/cfm$a;)Landroid/widget/TextView;
    .locals 1

    .line 224
    iget-object v0, p0, Lo/cfm$a;->d:Landroid/widget/TextView;

    return-object v0
.end method

.method static synthetic d(Lo/cfm$a;Landroid/widget/ImageView;)Landroid/widget/ImageView;
    .locals 0

    .line 224
    iput-object p1, p0, Lo/cfm$a;->c:Landroid/widget/ImageView;

    return-object p1
.end method

.method static synthetic e(Lo/cfm$a;)Landroid/view/View;
    .locals 1

    .line 224
    iget-object v0, p0, Lo/cfm$a;->e:Landroid/view/View;

    return-object v0
.end method
