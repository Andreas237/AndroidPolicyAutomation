.class public Lo/bcq;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Landroid/app/Activity;)Landroid/content/DialogInterface$OnClickListener;
    .locals 1

    .line 17
    new-instance v0, Lo/bcq$1;

    invoke-direct {v0, p0}, Lo/bcq$1;-><init>(Landroid/app/Activity;)V

    return-object v0
.end method

.method public static c(Landroid/app/Activity;)Landroid/content/DialogInterface$OnKeyListener;
    .locals 1

    .line 33
    new-instance v0, Lo/bcq$4;

    invoke-direct {v0, p0}, Lo/bcq$4;-><init>(Landroid/app/Activity;)V

    return-object v0
.end method
