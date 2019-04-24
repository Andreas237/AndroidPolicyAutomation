.class public final enum Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;
.super Ljava/lang/Enum;
.source "StatementBuilder.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/j256/ormlite/stmt/StatementBuilder;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "StatementType"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;

.field public static final enum DELETE:Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;

.field public static final enum EXECUTE:Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;

.field public static final enum SELECT:Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;

.field public static final enum SELECT_LONG:Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;

.field public static final enum SELECT_RAW:Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;

.field public static final enum UPDATE:Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;


# instance fields
.field private final okForExecute:Z

.field private final okForQuery:Z

.field private final okForStatementBuilder:Z

.field private final okForUpdate:Z


# direct methods
.method static constructor <clinit>()V
    .locals 15

    .line 205
    new-instance v7, Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;

    const-string v1, "SELECT"

    const/4 v2, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x1

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v0, v7

    invoke-direct/range {v0 .. v6}, Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;-><init>(Ljava/lang/String;IZZZZ)V

    sput-object v7, Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;->SELECT:Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;

    .line 207
    new-instance v0, Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;

    const-string v9, "SELECT_LONG"

    const/4 v10, 0x1

    const/4 v11, 0x1

    const/4 v12, 0x1

    const/4 v13, 0x0

    const/4 v14, 0x0

    move-object v8, v0

    invoke-direct/range {v8 .. v14}, Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;-><init>(Ljava/lang/String;IZZZZ)V

    sput-object v0, Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;->SELECT_LONG:Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;

    .line 209
    new-instance v0, Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;

    const-string v2, "SELECT_RAW"

    const/4 v3, 0x2

    const/4 v5, 0x1

    const/4 v7, 0x0

    move-object v1, v0

    invoke-direct/range {v1 .. v7}, Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;-><init>(Ljava/lang/String;IZZZZ)V

    sput-object v0, Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;->SELECT_RAW:Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;

    .line 211
    new-instance v0, Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;

    const-string v9, "UPDATE"

    const/4 v10, 0x3

    const/4 v12, 0x0

    const/4 v13, 0x1

    move-object v8, v0

    invoke-direct/range {v8 .. v14}, Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;-><init>(Ljava/lang/String;IZZZZ)V

    sput-object v0, Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;->UPDATE:Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;

    .line 213
    new-instance v0, Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;

    const-string v2, "DELETE"

    const/4 v3, 0x4

    const/4 v5, 0x0

    const/4 v6, 0x1

    move-object v1, v0

    invoke-direct/range {v1 .. v7}, Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;-><init>(Ljava/lang/String;IZZZZ)V

    sput-object v0, Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;->DELETE:Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;

    .line 215
    new-instance v0, Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;

    const-string v9, "EXECUTE"

    const/4 v10, 0x5

    const/4 v11, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x1

    move-object v8, v0

    invoke-direct/range {v8 .. v14}, Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;-><init>(Ljava/lang/String;IZZZZ)V

    sput-object v0, Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;->EXECUTE:Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;

    const/4 v0, 0x6

    .line 203
    new-array v0, v0, [Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;

    sget-object v1, Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;->SELECT:Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;->SELECT_LONG:Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;->SELECT_RAW:Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;->UPDATE:Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    sget-object v1, Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;->DELETE:Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;

    const/4 v2, 0x4

    aput-object v1, v0, v2

    sget-object v1, Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;->EXECUTE:Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;

    const/4 v2, 0x5

    aput-object v1, v0, v2

    sput-object v0, Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;->$VALUES:[Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;IZZZZ)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ZZZZ)V"
        }
    .end annotation

    .line 225
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 226
    iput-boolean p3, p0, Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;->okForStatementBuilder:Z

    .line 227
    iput-boolean p4, p0, Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;->okForQuery:Z

    .line 228
    iput-boolean p5, p0, Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;->okForUpdate:Z

    .line 229
    iput-boolean p6, p0, Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;->okForExecute:Z

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;
    .locals 1

    .line 203
    const-class v0, Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;

    return-object p0
.end method

.method public static values()[Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;
    .locals 1

    .line 203
    sget-object v0, Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;->$VALUES:[Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;

    invoke-virtual {v0}, [Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;

    return-object v0
.end method


# virtual methods
.method public isOkForExecute()Z
    .locals 1

    .line 245
    iget-boolean v0, p0, Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;->okForExecute:Z

    return v0
.end method

.method public isOkForQuery()Z
    .locals 1

    .line 237
    iget-boolean v0, p0, Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;->okForQuery:Z

    return v0
.end method

.method public isOkForStatementBuilder()Z
    .locals 1

    .line 233
    iget-boolean v0, p0, Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;->okForStatementBuilder:Z

    return v0
.end method

.method public isOkForUpdate()Z
    .locals 1

    .line 241
    iget-boolean v0, p0, Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;->okForUpdate:Z

    return v0
.end method
