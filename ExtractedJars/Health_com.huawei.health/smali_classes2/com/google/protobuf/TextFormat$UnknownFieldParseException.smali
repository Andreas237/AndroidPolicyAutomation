.class public Lcom/google/protobuf/TextFormat$UnknownFieldParseException;
.super Lcom/google/protobuf/TextFormat$ParseException;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/protobuf/TextFormat;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "UnknownFieldParseException"
.end annotation


# instance fields
.field private final unknownField:Ljava/lang/String;


# direct methods
.method public constructor <init>(IILjava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1183
    invoke-direct {p0, p1, p2, p4}, Lcom/google/protobuf/TextFormat$ParseException;-><init>(IILjava/lang/String;)V

    .line 1184
    iput-object p3, p0, Lcom/google/protobuf/TextFormat$UnknownFieldParseException;->unknownField:Ljava/lang/String;

    .line 1185
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 3

    .line 1169
    const-string v0, ""

    const/4 v1, -0x1

    const/4 v2, -0x1

    invoke-direct {p0, v1, v2, v0, p1}, Lcom/google/protobuf/TextFormat$UnknownFieldParseException;-><init>(IILjava/lang/String;Ljava/lang/String;)V

    .line 1170
    return-void
.end method


# virtual methods
.method public getUnknownField()Ljava/lang/String;
    .locals 1

    .line 1192
    iget-object v0, p0, Lcom/google/protobuf/TextFormat$UnknownFieldParseException;->unknownField:Ljava/lang/String;

    return-object v0
.end method
