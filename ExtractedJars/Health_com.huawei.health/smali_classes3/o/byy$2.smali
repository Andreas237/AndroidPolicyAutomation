.class Lo/byy$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/byy;->onRestoreInstanceState(Landroid/os/Parcelable;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lo/byy;


# direct methods
.method constructor <init>(Lo/byy;)V
    .locals 0

    .line 310
    iput-object p1, p0, Lo/byy$2;->e:Lo/byy;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .line 313
    iget-object v0, p0, Lo/byy$2;->e:Lo/byy;

    invoke-virtual {v0}, Lo/byy;->e()V

    .line 314
    return-void
.end method
