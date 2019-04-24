.class public Lo/erx$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/erx;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field private b:Landroid/widget/ImageView;

.field private c:Landroid/widget/TextView;

.field private e:Landroid/widget/ImageView;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 205
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic a(Lo/erx$a;)Landroid/widget/ImageView;
    .locals 1

    .line 205
    iget-object v0, p0, Lo/erx$a;->b:Landroid/widget/ImageView;

    return-object v0
.end method

.method static synthetic a(Lo/erx$a;Landroid/widget/ImageView;)Landroid/widget/ImageView;
    .locals 0

    .line 205
    iput-object p1, p0, Lo/erx$a;->b:Landroid/widget/ImageView;

    return-object p1
.end method

.method static synthetic b(Lo/erx$a;)Landroid/widget/ImageView;
    .locals 1

    .line 205
    iget-object v0, p0, Lo/erx$a;->e:Landroid/widget/ImageView;

    return-object v0
.end method

.method static synthetic b(Lo/erx$a;Landroid/widget/ImageView;)Landroid/widget/ImageView;
    .locals 0

    .line 205
    iput-object p1, p0, Lo/erx$a;->e:Landroid/widget/ImageView;

    return-object p1
.end method

.method static synthetic b(Lo/erx$a;Landroid/widget/TextView;)Landroid/widget/TextView;
    .locals 0

    .line 205
    iput-object p1, p0, Lo/erx$a;->c:Landroid/widget/TextView;

    return-object p1
.end method

.method static synthetic e(Lo/erx$a;)Landroid/widget/TextView;
    .locals 1

    .line 205
    iget-object v0, p0, Lo/erx$a;->c:Landroid/widget/TextView;

    return-object v0
.end method
