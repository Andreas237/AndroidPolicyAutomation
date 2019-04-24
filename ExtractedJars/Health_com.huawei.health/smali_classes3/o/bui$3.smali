.class Lo/bui$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/bui;->c(Landroid/os/Handler;ILjava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lo/bui;

.field final synthetic d:I

.field final synthetic e:Ljava/lang/String;


# direct methods
.method constructor <init>(Lo/bui;ILjava/lang/String;)V
    .locals 0

    .line 65
    iput-object p1, p0, Lo/bui$3;->c:Lo/bui;

    iput p2, p0, Lo/bui$3;->d:I

    iput-object p3, p0, Lo/bui$3;->e:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 68
    iget-object v0, p0, Lo/bui$3;->c:Lo/bui;

    iget v1, p0, Lo/bui$3;->d:I

    iget-object v2, p0, Lo/bui$3;->e:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lo/bui;->b(ILjava/lang/String;)V

    .line 69
    return-void
.end method
