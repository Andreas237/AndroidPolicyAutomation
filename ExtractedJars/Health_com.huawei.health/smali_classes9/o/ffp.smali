.class public Lo/ffp;
.super Landroid/app/AlertDialog;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/ffp$e;
    }
.end annotation


# instance fields
.field private a:Landroid/app/AlertDialog;


# direct methods
.method private constructor <init>(Landroid/content/Context;I)V
    .locals 0

    .line 41
    invoke-direct {p0, p1, p2}, Landroid/app/AlertDialog;-><init>(Landroid/content/Context;I)V

    .line 42
    return-void
.end method

.method synthetic constructor <init>(Landroid/content/Context;ILo/ffp$1;)V
    .locals 0

    .line 31
    invoke-direct {p0, p1, p2}, Lo/ffp;-><init>(Landroid/content/Context;I)V

    return-void
.end method

.method static synthetic a(Lo/ffp;Landroid/app/AlertDialog;)Landroid/app/AlertDialog;
    .locals 0

    .line 31
    iput-object p1, p0, Lo/ffp;->a:Landroid/app/AlertDialog;

    return-object p1
.end method


# virtual methods
.method public dismiss()V
    .locals 2

    .line 55
    iget-object v0, p0, Lo/ffp;->a:Landroid/app/AlertDialog;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 56
    iget-object v0, p0, Lo/ffp;->a:Landroid/app/AlertDialog;

    invoke-virtual {v0}, Landroid/app/AlertDialog;->dismiss()V

    .line 58
    :cond_0
    return-void
.end method

.method public show()V
    .locals 2

    .line 47
    iget-object v0, p0, Lo/ffp;->a:Landroid/app/AlertDialog;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 48
    iget-object v0, p0, Lo/ffp;->a:Landroid/app/AlertDialog;

    invoke-virtual {v0}, Landroid/app/AlertDialog;->show()V

    .line 50
    :cond_0
    return-void
.end method
