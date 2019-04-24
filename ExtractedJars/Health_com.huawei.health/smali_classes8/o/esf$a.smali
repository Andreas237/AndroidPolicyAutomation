.class public Lo/esf$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/esf;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field private a:Landroid/widget/TextView;

.field private b:Landroid/widget/TextView;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 90
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic b(Lo/esf$a;)Landroid/widget/TextView;
    .locals 1

    .line 90
    iget-object v0, p0, Lo/esf$a;->a:Landroid/widget/TextView;

    return-object v0
.end method

.method static synthetic c(Lo/esf$a;)Landroid/widget/TextView;
    .locals 1

    .line 90
    iget-object v0, p0, Lo/esf$a;->b:Landroid/widget/TextView;

    return-object v0
.end method

.method static synthetic c(Lo/esf$a;Landroid/widget/TextView;)Landroid/widget/TextView;
    .locals 0

    .line 90
    iput-object p1, p0, Lo/esf$a;->a:Landroid/widget/TextView;

    return-object p1
.end method

.method static synthetic e(Lo/esf$a;Landroid/widget/TextView;)Landroid/widget/TextView;
    .locals 0

    .line 90
    iput-object p1, p0, Lo/esf$a;->b:Landroid/widget/TextView;

    return-object p1
.end method
