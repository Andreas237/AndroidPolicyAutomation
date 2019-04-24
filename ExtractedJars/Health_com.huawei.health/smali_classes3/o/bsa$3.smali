.class final Lo/bsa$3;
.super Lo/bsf;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/bsa;->d(Ljava/lang/String;Lorg/json/JSONObject;Ljava/util/Map;Lo/bsr;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/bsr;

.field final synthetic e:Ljava/lang/String;


# direct methods
.method constructor <init>(Ljava/lang/String;Lo/bsr;)V
    .locals 0

    .line 351
    iput-object p1, p0, Lo/bsa$3;->e:Ljava/lang/String;

    iput-object p2, p0, Lo/bsa$3;->a:Lo/bsr;

    invoke-direct {p0}, Lo/bsf;-><init>()V

    return-void
.end method


# virtual methods
.method public onFailure(Lokhttp3/Request;Ljava/lang/Exception;)V
    .locals 2

    .line 354
    iget-object v0, p0, Lo/bsa$3;->e:Ljava/lang/String;

    iget-object v1, p0, Lo/bsa$3;->a:Lo/bsr;

    invoke-static {v0, p2, v1}, Lo/bsa;->a(Ljava/lang/String;Ljava/lang/Exception;Lo/bsr;)V

    .line 355
    return-void
.end method

.method public onSuccess(Lorg/json/JSONObject;)V
    .locals 2

    .line 359
    iget-object v0, p0, Lo/bsa$3;->e:Ljava/lang/String;

    iget-object v1, p0, Lo/bsa$3;->a:Lo/bsr;

    invoke-static {v0, p1, v1}, Lo/bsa;->c(Ljava/lang/String;Lorg/json/JSONObject;Lo/bsr;)V

    .line 360
    return-void
.end method
