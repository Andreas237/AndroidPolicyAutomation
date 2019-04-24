.class Lo/fer$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/fer;->onLayout(ZIIII)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lo/fer;


# direct methods
.method constructor <init>(Lo/fer;)V
    .locals 0

    .line 240
    iput-object p1, p0, Lo/fer$4;->d:Lo/fer;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .line 243
    iget-object v0, p0, Lo/fer$4;->d:Lo/fer;

    invoke-virtual {v0}, Lo/fer;->requestLayout()V

    .line 244
    return-void
.end method
