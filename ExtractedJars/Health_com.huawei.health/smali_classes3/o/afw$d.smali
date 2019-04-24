.class final Lo/afw$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/afw;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x10
    name = "d"
.end annotation


# instance fields
.field final synthetic a:Lo/afw;

.field private b:I

.field private c:I

.field private d:I

.field private e:Landroid/os/ParcelFileDescriptor;


# direct methods
.method public constructor <init>(Lo/afw;IILandroid/os/ParcelFileDescriptor;I)V
    .locals 0

    .line 102
    iput-object p1, p0, Lo/afw$d;->a:Lo/afw;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 103
    iput p2, p0, Lo/afw$d;->b:I

    .line 104
    iput p3, p0, Lo/afw$d;->d:I

    .line 105
    iput-object p4, p0, Lo/afw$d;->e:Landroid/os/ParcelFileDescriptor;

    .line 106
    iput p5, p0, Lo/afw$d;->c:I

    .line 107
    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    .line 111
    iget-object v0, p0, Lo/afw$d;->a:Lo/afw;

    iget v1, p0, Lo/afw$d;->b:I

    iget v2, p0, Lo/afw$d;->d:I

    iget-object v3, p0, Lo/afw$d;->e:Landroid/os/ParcelFileDescriptor;

    iget v4, p0, Lo/afw$d;->c:I

    invoke-virtual {v0, v1, v2, v3, v4}, Lo/afw;->a(IILandroid/os/ParcelFileDescriptor;I)V

    .line 112
    return-void
.end method
