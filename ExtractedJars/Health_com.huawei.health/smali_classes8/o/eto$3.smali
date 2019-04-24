.class Lo/eto$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/mf;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/eto;->e()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lo/eto;


# direct methods
.method constructor <init>(Lo/eto;)V
    .locals 0

    .line 244
    iput-object p1, p0, Lo/eto$3;->c:Lo/eto;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public b(FLo/lh;)Ljava/lang/String;
    .locals 2

    .line 247
    const/high16 v0, 0x42c80000    # 100.0f

    cmpl-float v0, p1, v0

    if-lez v0, :cond_0

    .line 248
    const/high16 v0, 0x42c80000    # 100.0f

    div-float v0, p1, v0

    float-to-int v0, v0

    mul-int/lit8 v0, v0, 0x64

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 250
    :cond_0
    float-to-int v0, p1

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
