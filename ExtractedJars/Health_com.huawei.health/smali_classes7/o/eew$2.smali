.class Lo/eew$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/eew;->a(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/eew;


# direct methods
.method constructor <init>(Lo/eew;)V
    .locals 0

    .line 125
    iput-object p1, p0, Lo/eew$2;->a:Lo/eew;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .line 128
    iget-object v0, p0, Lo/eew$2;->a:Lo/eew;

    invoke-virtual {v0}, Lo/eew;->e()V

    .line 129
    return-void
.end method
