.class Lo/fha$7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/fha;->a(Ljava/util/List;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lo/fha;

.field final synthetic e:Ljava/util/List;


# direct methods
.method constructor <init>(Lo/fha;Ljava/util/List;)V
    .locals 0

    .line 350
    iput-object p1, p0, Lo/fha$7;->d:Lo/fha;

    iput-object p2, p0, Lo/fha$7;->e:Ljava/util/List;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 353
    iget-object v0, p0, Lo/fha$7;->d:Lo/fha;

    iget-object v1, p0, Lo/fha$7;->e:Ljava/util/List;

    invoke-virtual {v0, v1}, Lo/fha;->setWheelData(Ljava/util/List;)V

    .line 354
    iget-object v0, p0, Lo/fha$7;->d:Lo/fha;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/fha;->b(Lo/fha;I)V

    .line 355
    iget-object v0, p0, Lo/fha$7;->d:Lo/fha;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lo/fha;->b(Lo/fha;Z)V

    .line 356
    return-void
.end method
