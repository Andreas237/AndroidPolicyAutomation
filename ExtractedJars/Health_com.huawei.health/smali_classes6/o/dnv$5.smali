.class Lo/dnv$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/dnv;->e()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lo/dnv;


# direct methods
.method constructor <init>(Lo/dnv;)V
    .locals 0

    .line 607
    iput-object p1, p0, Lo/dnv$5;->e:Lo/dnv;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 611
    const/4 v1, 0x1

    :goto_0
    const/16 v0, 0x8

    if-ge v1, v0, :cond_0

    .line 613
    iget-object v0, p0, Lo/dnv$5;->e:Lo/dnv;

    invoke-static {v0, v1}, Lo/dnv;->b(Lo/dnv;I)V

    .line 611
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 616
    :cond_0
    return-void
.end method
