.class public final enum Lorg/researchstack/backbone/storage/database/StepRecord$$Configuration$Fields;
.super Ljava/lang/Enum;
.source "StepRecord$$Configuration.java"

# interfaces
.implements Lco/touchlab/squeaky/field/FieldsEnum;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/researchstack/backbone/storage/database/StepRecord$$Configuration;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "Fields"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lorg/researchstack/backbone/storage/database/StepRecord$$Configuration$Fields;",
        ">;",
        "Lco/touchlab/squeaky/field/FieldsEnum;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lorg/researchstack/backbone/storage/database/StepRecord$$Configuration$Fields;

.field public static final enum completed:Lorg/researchstack/backbone/storage/database/StepRecord$$Configuration$Fields;

.field public static final enum id:Lorg/researchstack/backbone/storage/database/StepRecord$$Configuration$Fields;

.field public static final enum result:Lorg/researchstack/backbone/storage/database/StepRecord$$Configuration$Fields;

.field public static final enum started:Lorg/researchstack/backbone/storage/database/StepRecord$$Configuration$Fields;

.field public static final enum stepId:Lorg/researchstack/backbone/storage/database/StepRecord$$Configuration$Fields;

.field public static final enum taskId:Lorg/researchstack/backbone/storage/database/StepRecord$$Configuration$Fields;

.field public static final enum taskRecordId:Lorg/researchstack/backbone/storage/database/StepRecord$$Configuration$Fields;


# instance fields
.field private final fieldType:Lco/touchlab/squeaky/field/FieldType;


# direct methods
.method static constructor <clinit>()V
    .locals 25

    .prologue
    .line 172
    new-instance v22, Lorg/researchstack/backbone/storage/database/StepRecord$$Configuration$Fields;

    const-string v23, "id"

    const/16 v24, 0x0

    new-instance v3, Lco/touchlab/squeaky/field/FieldType;

    const-string v4, "steprecord"

    const-string v5, "id"

    const-string v6, "id"

    const/4 v7, 0x1

    const/4 v8, 0x1

    const/4 v9, 0x0

    sget-object v10, Lco/touchlab/squeaky/field/DataType;->INTEGER:Lco/touchlab/squeaky/field/DataType;

    sget-object v11, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    const/4 v12, 0x1

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    invoke-direct/range {v3 .. v21}, Lco/touchlab/squeaky/field/FieldType;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZLco/touchlab/squeaky/field/DataType;Ljava/lang/Class;ZLjava/lang/String;ZZZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v0, v22

    move-object/from16 v1, v23

    move/from16 v2, v24

    invoke-direct {v0, v1, v2, v3}, Lorg/researchstack/backbone/storage/database/StepRecord$$Configuration$Fields;-><init>(Ljava/lang/String;ILco/touchlab/squeaky/field/FieldType;)V

    sput-object v22, Lorg/researchstack/backbone/storage/database/StepRecord$$Configuration$Fields;->id:Lorg/researchstack/backbone/storage/database/StepRecord$$Configuration$Fields;

    .line 174
    new-instance v22, Lorg/researchstack/backbone/storage/database/StepRecord$$Configuration$Fields;

    const-string v23, "taskRecordId"

    const/16 v24, 0x1

    new-instance v3, Lco/touchlab/squeaky/field/FieldType;

    const-string v4, "steprecord"

    const-string v5, "taskRecordId"

    const-string v6, "taskRecordId"

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    sget-object v10, Lco/touchlab/squeaky/field/DataType;->INTEGER:Lco/touchlab/squeaky/field/DataType;

    sget-object v11, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    invoke-direct/range {v3 .. v21}, Lco/touchlab/squeaky/field/FieldType;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZLco/touchlab/squeaky/field/DataType;Ljava/lang/Class;ZLjava/lang/String;ZZZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v0, v22

    move-object/from16 v1, v23

    move/from16 v2, v24

    invoke-direct {v0, v1, v2, v3}, Lorg/researchstack/backbone/storage/database/StepRecord$$Configuration$Fields;-><init>(Ljava/lang/String;ILco/touchlab/squeaky/field/FieldType;)V

    sput-object v22, Lorg/researchstack/backbone/storage/database/StepRecord$$Configuration$Fields;->taskRecordId:Lorg/researchstack/backbone/storage/database/StepRecord$$Configuration$Fields;

    .line 176
    new-instance v22, Lorg/researchstack/backbone/storage/database/StepRecord$$Configuration$Fields;

    const-string v23, "taskId"

    const/16 v24, 0x2

    new-instance v3, Lco/touchlab/squeaky/field/FieldType;

    const-string v4, "steprecord"

    const-string v5, "taskId"

    const-string v6, "taskId"

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    sget-object v10, Lco/touchlab/squeaky/field/DataType;->STRING:Lco/touchlab/squeaky/field/DataType;

    const-class v11, Ljava/lang/String;

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    invoke-direct/range {v3 .. v21}, Lco/touchlab/squeaky/field/FieldType;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZLco/touchlab/squeaky/field/DataType;Ljava/lang/Class;ZLjava/lang/String;ZZZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v0, v22

    move-object/from16 v1, v23

    move/from16 v2, v24

    invoke-direct {v0, v1, v2, v3}, Lorg/researchstack/backbone/storage/database/StepRecord$$Configuration$Fields;-><init>(Ljava/lang/String;ILco/touchlab/squeaky/field/FieldType;)V

    sput-object v22, Lorg/researchstack/backbone/storage/database/StepRecord$$Configuration$Fields;->taskId:Lorg/researchstack/backbone/storage/database/StepRecord$$Configuration$Fields;

    .line 178
    new-instance v22, Lorg/researchstack/backbone/storage/database/StepRecord$$Configuration$Fields;

    const-string v23, "stepId"

    const/16 v24, 0x3

    new-instance v3, Lco/touchlab/squeaky/field/FieldType;

    const-string v4, "steprecord"

    const-string v5, "stepId"

    const-string v6, "stepId"

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    sget-object v10, Lco/touchlab/squeaky/field/DataType;->STRING:Lco/touchlab/squeaky/field/DataType;

    const-class v11, Ljava/lang/String;

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    invoke-direct/range {v3 .. v21}, Lco/touchlab/squeaky/field/FieldType;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZLco/touchlab/squeaky/field/DataType;Ljava/lang/Class;ZLjava/lang/String;ZZZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v0, v22

    move-object/from16 v1, v23

    move/from16 v2, v24

    invoke-direct {v0, v1, v2, v3}, Lorg/researchstack/backbone/storage/database/StepRecord$$Configuration$Fields;-><init>(Ljava/lang/String;ILco/touchlab/squeaky/field/FieldType;)V

    sput-object v22, Lorg/researchstack/backbone/storage/database/StepRecord$$Configuration$Fields;->stepId:Lorg/researchstack/backbone/storage/database/StepRecord$$Configuration$Fields;

    .line 180
    new-instance v22, Lorg/researchstack/backbone/storage/database/StepRecord$$Configuration$Fields;

    const-string v23, "started"

    const/16 v24, 0x4

    new-instance v3, Lco/touchlab/squeaky/field/FieldType;

    const-string v4, "steprecord"

    const-string v5, "started"

    const-string v6, "started"

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    sget-object v10, Lco/touchlab/squeaky/field/DataType;->DATE:Lco/touchlab/squeaky/field/DataType;

    const-class v11, Ljava/util/Date;

    const/4 v12, 0x1

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    invoke-direct/range {v3 .. v21}, Lco/touchlab/squeaky/field/FieldType;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZLco/touchlab/squeaky/field/DataType;Ljava/lang/Class;ZLjava/lang/String;ZZZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v0, v22

    move-object/from16 v1, v23

    move/from16 v2, v24

    invoke-direct {v0, v1, v2, v3}, Lorg/researchstack/backbone/storage/database/StepRecord$$Configuration$Fields;-><init>(Ljava/lang/String;ILco/touchlab/squeaky/field/FieldType;)V

    sput-object v22, Lorg/researchstack/backbone/storage/database/StepRecord$$Configuration$Fields;->started:Lorg/researchstack/backbone/storage/database/StepRecord$$Configuration$Fields;

    .line 182
    new-instance v22, Lorg/researchstack/backbone/storage/database/StepRecord$$Configuration$Fields;

    const-string v23, "completed"

    const/16 v24, 0x5

    new-instance v3, Lco/touchlab/squeaky/field/FieldType;

    const-string v4, "steprecord"

    const-string v5, "completed"

    const-string v6, "completed"

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    sget-object v10, Lco/touchlab/squeaky/field/DataType;->DATE:Lco/touchlab/squeaky/field/DataType;

    const-class v11, Ljava/util/Date;

    const/4 v12, 0x1

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    invoke-direct/range {v3 .. v21}, Lco/touchlab/squeaky/field/FieldType;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZLco/touchlab/squeaky/field/DataType;Ljava/lang/Class;ZLjava/lang/String;ZZZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v0, v22

    move-object/from16 v1, v23

    move/from16 v2, v24

    invoke-direct {v0, v1, v2, v3}, Lorg/researchstack/backbone/storage/database/StepRecord$$Configuration$Fields;-><init>(Ljava/lang/String;ILco/touchlab/squeaky/field/FieldType;)V

    sput-object v22, Lorg/researchstack/backbone/storage/database/StepRecord$$Configuration$Fields;->completed:Lorg/researchstack/backbone/storage/database/StepRecord$$Configuration$Fields;

    .line 184
    new-instance v22, Lorg/researchstack/backbone/storage/database/StepRecord$$Configuration$Fields;

    const-string v23, "result"

    const/16 v24, 0x6

    new-instance v3, Lco/touchlab/squeaky/field/FieldType;

    const-string v4, "steprecord"

    const-string v5, "result"

    const-string v6, "result"

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    sget-object v10, Lco/touchlab/squeaky/field/DataType;->STRING:Lco/touchlab/squeaky/field/DataType;

    const-class v11, Ljava/lang/String;

    const/4 v12, 0x1

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    invoke-direct/range {v3 .. v21}, Lco/touchlab/squeaky/field/FieldType;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZLco/touchlab/squeaky/field/DataType;Ljava/lang/Class;ZLjava/lang/String;ZZZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v0, v22

    move-object/from16 v1, v23

    move/from16 v2, v24

    invoke-direct {v0, v1, v2, v3}, Lorg/researchstack/backbone/storage/database/StepRecord$$Configuration$Fields;-><init>(Ljava/lang/String;ILco/touchlab/squeaky/field/FieldType;)V

    sput-object v22, Lorg/researchstack/backbone/storage/database/StepRecord$$Configuration$Fields;->result:Lorg/researchstack/backbone/storage/database/StepRecord$$Configuration$Fields;

    .line 171
    const/4 v3, 0x7

    new-array v3, v3, [Lorg/researchstack/backbone/storage/database/StepRecord$$Configuration$Fields;

    const/4 v4, 0x0

    sget-object v5, Lorg/researchstack/backbone/storage/database/StepRecord$$Configuration$Fields;->id:Lorg/researchstack/backbone/storage/database/StepRecord$$Configuration$Fields;

    aput-object v5, v3, v4

    const/4 v4, 0x1

    sget-object v5, Lorg/researchstack/backbone/storage/database/StepRecord$$Configuration$Fields;->taskRecordId:Lorg/researchstack/backbone/storage/database/StepRecord$$Configuration$Fields;

    aput-object v5, v3, v4

    const/4 v4, 0x2

    sget-object v5, Lorg/researchstack/backbone/storage/database/StepRecord$$Configuration$Fields;->taskId:Lorg/researchstack/backbone/storage/database/StepRecord$$Configuration$Fields;

    aput-object v5, v3, v4

    const/4 v4, 0x3

    sget-object v5, Lorg/researchstack/backbone/storage/database/StepRecord$$Configuration$Fields;->stepId:Lorg/researchstack/backbone/storage/database/StepRecord$$Configuration$Fields;

    aput-object v5, v3, v4

    const/4 v4, 0x4

    sget-object v5, Lorg/researchstack/backbone/storage/database/StepRecord$$Configuration$Fields;->started:Lorg/researchstack/backbone/storage/database/StepRecord$$Configuration$Fields;

    aput-object v5, v3, v4

    const/4 v4, 0x5

    sget-object v5, Lorg/researchstack/backbone/storage/database/StepRecord$$Configuration$Fields;->completed:Lorg/researchstack/backbone/storage/database/StepRecord$$Configuration$Fields;

    aput-object v5, v3, v4

    const/4 v4, 0x6

    sget-object v5, Lorg/researchstack/backbone/storage/database/StepRecord$$Configuration$Fields;->result:Lorg/researchstack/backbone/storage/database/StepRecord$$Configuration$Fields;

    aput-object v5, v3, v4

    sput-object v3, Lorg/researchstack/backbone/storage/database/StepRecord$$Configuration$Fields;->$VALUES:[Lorg/researchstack/backbone/storage/database/StepRecord$$Configuration$Fields;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILco/touchlab/squeaky/field/FieldType;)V
    .locals 0
    .param p3, "fieldType"    # Lco/touchlab/squeaky/field/FieldType;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/touchlab/squeaky/field/FieldType;",
            ")V"
        }
    .end annotation

    .prologue
    .line 188
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 189
    iput-object p3, p0, Lorg/researchstack/backbone/storage/database/StepRecord$$Configuration$Fields;->fieldType:Lco/touchlab/squeaky/field/FieldType;

    .line 190
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lorg/researchstack/backbone/storage/database/StepRecord$$Configuration$Fields;
    .locals 1
    .param p0, "name"    # Ljava/lang/String;

    .prologue
    .line 171
    const-class v0, Lorg/researchstack/backbone/storage/database/StepRecord$$Configuration$Fields;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lorg/researchstack/backbone/storage/database/StepRecord$$Configuration$Fields;

    return-object v0
.end method

.method public static values()[Lorg/researchstack/backbone/storage/database/StepRecord$$Configuration$Fields;
    .locals 1

    .prologue
    .line 171
    sget-object v0, Lorg/researchstack/backbone/storage/database/StepRecord$$Configuration$Fields;->$VALUES:[Lorg/researchstack/backbone/storage/database/StepRecord$$Configuration$Fields;

    invoke-virtual {v0}, [Lorg/researchstack/backbone/storage/database/StepRecord$$Configuration$Fields;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lorg/researchstack/backbone/storage/database/StepRecord$$Configuration$Fields;

    return-object v0
.end method


# virtual methods
.method public getFieldType()Lco/touchlab/squeaky/field/FieldType;
    .locals 1

    .prologue
    .line 194
    iget-object v0, p0, Lorg/researchstack/backbone/storage/database/StepRecord$$Configuration$Fields;->fieldType:Lco/touchlab/squeaky/field/FieldType;

    return-object v0
.end method
