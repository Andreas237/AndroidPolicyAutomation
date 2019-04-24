.class Lo/cwc$f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/alk$e;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/cwc;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "f"
.end annotation


# instance fields
.field final synthetic d:Lo/cwc;


# direct methods
.method private constructor <init>(Lo/cwc;)V
    .locals 0

    .line 1165
    iput-object p1, p0, Lo/cwc$f;->d:Lo/cwc;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lo/cwc;Lo/cwc$4;)V
    .locals 0

    .line 1165
    invoke-direct {p0, p1}, Lo/cwc$f;-><init>(Lo/cwc;)V

    return-void
.end method


# virtual methods
.method public b(Ljava/lang/String;)V
    .locals 4

    .line 1183
    const-string v0, "Track_PluginHealthTrackAdapterImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "onMeasureDevice produtId is "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1184
    iget-object v0, p0, Lo/cwc$f;->d:Lo/cwc;

    invoke-static {v0, p1}, Lo/cwc;->d(Lo/cwc;Ljava/lang/String;)Ljava/lang/String;

    .line 1185
    return-void
.end method

.method public b(Lo/alk$c;)V
    .locals 4

    .line 1173
    const-string v0, "Track_PluginHealthTrackAdapterImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onMeasureCompleted"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1174
    return-void
.end method
