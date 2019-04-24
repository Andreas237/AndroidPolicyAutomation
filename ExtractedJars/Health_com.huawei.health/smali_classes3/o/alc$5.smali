.class Lo/alc$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/cmh;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/alc;->c()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lo/alc;


# direct methods
.method constructor <init>(Lo/alc;)V
    .locals 0

    .line 94
    iput-object p1, p0, Lo/alc$5;->e:Lo/alc;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResult(Z)V
    .locals 4

    .line 96
    iget-object v0, p0, Lo/alc$5;->e:Lo/alc;

    invoke-static {v0}, Lo/alc;->d(Lo/alc;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "isSuccess="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 97
    return-void
.end method
