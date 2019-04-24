.class public Lo/erx$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/erx;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "c"
.end annotation


# instance fields
.field private a:Landroid/widget/TextView;

.field private e:Landroid/widget/TextView;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 213
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic c(Lo/erx$c;Landroid/widget/TextView;)Landroid/widget/TextView;
    .locals 0

    .line 213
    iput-object p1, p0, Lo/erx$c;->e:Landroid/widget/TextView;

    return-object p1
.end method

.method static synthetic d(Lo/erx$c;)Landroid/widget/TextView;
    .locals 1

    .line 213
    iget-object v0, p0, Lo/erx$c;->e:Landroid/widget/TextView;

    return-object v0
.end method

.method static synthetic e(Lo/erx$c;)Landroid/widget/TextView;
    .locals 1

    .line 213
    iget-object v0, p0, Lo/erx$c;->a:Landroid/widget/TextView;

    return-object v0
.end method

.method static synthetic e(Lo/erx$c;Landroid/widget/TextView;)Landroid/widget/TextView;
    .locals 0

    .line 213
    iput-object p1, p0, Lo/erx$c;->a:Landroid/widget/TextView;

    return-object p1
.end method
