.class Lo/eaw$1;
.super Ljava/util/HashMap;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/eaw;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/eaw;


# direct methods
.method constructor <init>(Lo/eaw;)V
    .locals 2

    .line 868
    iput-object p1, p0, Lo/eaw$1;->b:Lo/eaw;

    invoke-direct {p0}, Ljava/util/HashMap;-><init>()V

    .line 870
    const-string v0, "sr-Latn"

    const-string v1, "b+sr+Latn"

    invoke-virtual {p0, v0, v1}, Lo/eaw$1;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 871
    const-string v0, "jv-Latn"

    const-string v1, "b+jv+Latn"

    invoke-virtual {p0, v0, v1}, Lo/eaw$1;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 872
    return-void
.end method
