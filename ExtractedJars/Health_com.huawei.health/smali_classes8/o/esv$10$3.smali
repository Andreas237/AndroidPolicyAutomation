.class Lo/esv$10$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/esv$10;->c(ILjava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/esv$10;


# direct methods
.method constructor <init>(Lo/esv$10;)V
    .locals 0

    .line 1658
    iput-object p1, p0, Lo/esv$10$3;->b:Lo/esv$10;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .line 1661
    iget-object v0, p0, Lo/esv$10$3;->b:Lo/esv$10;

    iget-object v0, v0, Lo/esv$10;->b:Lo/esv;

    invoke-virtual {v0}, Lo/esv;->c()V

    .line 1662
    return-void
.end method
