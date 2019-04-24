.class public Lcom/google/protobuf/TextFormat$Parser$Builder;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/protobuf/TextFormat$Parser;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Builder"
.end annotation


# instance fields
.field private allowUnknownFields:Z

.field private parseInfoTreeBuilder:Lcom/google/protobuf/TextFormatParseInfoTree$Builder;

.field private singularOverwritePolicy:Lcom/google/protobuf/TextFormat$Parser$SingularOverwritePolicy;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1300
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1301
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/protobuf/TextFormat$Parser$Builder;->allowUnknownFields:Z

    .line 1302
    sget-object v0, Lcom/google/protobuf/TextFormat$Parser$SingularOverwritePolicy;->ALLOW_SINGULAR_OVERWRITES:Lcom/google/protobuf/TextFormat$Parser$SingularOverwritePolicy;

    iput-object v0, p0, Lcom/google/protobuf/TextFormat$Parser$Builder;->singularOverwritePolicy:Lcom/google/protobuf/TextFormat$Parser$SingularOverwritePolicy;

    .line 1304
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/protobuf/TextFormat$Parser$Builder;->parseInfoTreeBuilder:Lcom/google/protobuf/TextFormatParseInfoTree$Builder;

    return-void
.end method


# virtual methods
.method public build()Lcom/google/protobuf/TextFormat$Parser;
    .locals 5

    .line 1322
    new-instance v0, Lcom/google/protobuf/TextFormat$Parser;

    iget-boolean v1, p0, Lcom/google/protobuf/TextFormat$Parser$Builder;->allowUnknownFields:Z

    iget-object v2, p0, Lcom/google/protobuf/TextFormat$Parser$Builder;->singularOverwritePolicy:Lcom/google/protobuf/TextFormat$Parser$SingularOverwritePolicy;

    iget-object v3, p0, Lcom/google/protobuf/TextFormat$Parser$Builder;->parseInfoTreeBuilder:Lcom/google/protobuf/TextFormatParseInfoTree$Builder;

    const/4 v4, 0x0

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/google/protobuf/TextFormat$Parser;-><init>(ZLcom/google/protobuf/TextFormat$Parser$SingularOverwritePolicy;Lcom/google/protobuf/TextFormatParseInfoTree$Builder;Lcom/google/protobuf/TextFormat$1;)V

    return-object v0
.end method

.method public setParseInfoTreeBuilder(Lcom/google/protobuf/TextFormatParseInfoTree$Builder;)Lcom/google/protobuf/TextFormat$Parser$Builder;
    .locals 0

    .line 1317
    iput-object p1, p0, Lcom/google/protobuf/TextFormat$Parser$Builder;->parseInfoTreeBuilder:Lcom/google/protobuf/TextFormatParseInfoTree$Builder;

    .line 1318
    return-object p0
.end method

.method public setSingularOverwritePolicy(Lcom/google/protobuf/TextFormat$Parser$SingularOverwritePolicy;)Lcom/google/protobuf/TextFormat$Parser$Builder;
    .locals 0

    .line 1311
    iput-object p1, p0, Lcom/google/protobuf/TextFormat$Parser$Builder;->singularOverwritePolicy:Lcom/google/protobuf/TextFormat$Parser$SingularOverwritePolicy;

    .line 1312
    return-object p0
.end method
