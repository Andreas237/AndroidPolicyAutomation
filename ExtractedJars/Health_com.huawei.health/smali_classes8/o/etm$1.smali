.class Lo/etm$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/etm;->g()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/etm;


# direct methods
.method constructor <init>(Lo/etm;)V
    .locals 0

    .line 190
    iput-object p1, p0, Lo/etm$1;->b:Lo/etm;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .line 193
    iget-object v0, p0, Lo/etm$1;->b:Lo/etm;

    invoke-virtual {v0}, Lo/etm;->b()V

    .line 194
    return-void
.end method
