.class Lo/fbs$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/fbs;->a()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/fbs;

.field final synthetic d:I


# direct methods
.method constructor <init>(Lo/fbs;I)V
    .locals 0

    .line 44
    iput-object p1, p0, Lo/fbs$3;->b:Lo/fbs;

    iput p2, p0, Lo/fbs$3;->d:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 47
    iget-object v0, p0, Lo/fbs$3;->b:Lo/fbs;

    iget v1, p0, Lo/fbs$3;->d:I

    invoke-virtual {v0, v1}, Lo/fbs;->e(I)V

    .line 48
    return-void
.end method
