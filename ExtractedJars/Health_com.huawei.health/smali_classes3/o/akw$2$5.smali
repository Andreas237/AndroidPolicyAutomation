.class Lo/akw$2$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/akw$2;->onReceive(Landroid/content/Context;Landroid/content/Intent;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/akw$2;

.field final synthetic c:I


# direct methods
.method constructor <init>(Lo/akw$2;I)V
    .locals 0

    .line 50
    iput-object p1, p0, Lo/akw$2$5;->b:Lo/akw$2;

    iput p2, p0, Lo/akw$2$5;->c:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 53
    iget-object v0, p0, Lo/akw$2$5;->b:Lo/akw$2;

    iget-object v0, v0, Lo/akw$2;->d:Lo/akw;

    iget v1, p0, Lo/akw$2$5;->c:I

    invoke-virtual {v0, v1}, Lo/akw;->e(I)Z

    .line 54
    return-void
.end method
