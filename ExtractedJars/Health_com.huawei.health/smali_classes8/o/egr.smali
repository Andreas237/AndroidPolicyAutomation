.class public Lo/egr;
.super Landroid/app/Dialog;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/egr$c;,
        Lo/egr$b;
    }
.end annotation


# instance fields
.field private b:Landroid/content/Context;

.field private c:Lo/egr$c;


# direct methods
.method private constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 31
    sget v0, Lcom/huawei/ui/commonui/R$style;->CustomDialog:I

    invoke-direct {p0, p1, v0}, Lo/egr;-><init>(Landroid/content/Context;I)V

    .line 32
    return-void
.end method

.method private constructor <init>(Landroid/content/Context;I)V
    .locals 1

    .line 35
    invoke-direct {p0, p1, p2}, Landroid/app/Dialog;-><init>(Landroid/content/Context;I)V

    .line 36
    iput-object p1, p0, Lo/egr;->b:Landroid/content/Context;

    .line 37
    new-instance v0, Lo/egr$c;

    invoke-direct {v0, p1}, Lo/egr$c;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lo/egr;->c:Lo/egr$c;

    .line 38
    return-void
.end method

.method synthetic constructor <init>(Landroid/content/Context;Lo/egr$5;)V
    .locals 0

    .line 25
    invoke-direct {p0, p1}, Lo/egr;-><init>(Landroid/content/Context;)V

    return-void
.end method


# virtual methods
.method public c()Lo/egr$c;
    .locals 1

    .line 62
    iget-object v0, p0, Lo/egr;->c:Lo/egr$c;

    return-object v0
.end method
