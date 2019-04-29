.class final Lcom/google/android/gms/internal/measurement/zzes;
.super Ljava/lang/Object;


# instance fields
.field final name:Ljava/lang/String;

.field final zzafs:J

.field final zzaft:J

.field final zzafu:J

.field final zzafv:J

.field final zzafw:Ljava/lang/Long;

.field final zzafx:Ljava/lang/Long;

.field final zzafy:Ljava/lang/Boolean;

.field final zzti:Ljava/lang/String;


# direct methods
.method constructor <init>(Ljava/lang/String;Ljava/lang/String;JJJJLjava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;)V
    .locals 12

    move-object v0, p0

    move-wide v1, p3

    move-wide/from16 v3, p5

    move-wide/from16 v5, p9

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotEmpty(Ljava/lang/String;)Ljava/lang/String;

    invoke-static {p2}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotEmpty(Ljava/lang/String;)Ljava/lang/String;

    const-wide/16 v7, 0x0

    cmp-long v9, v1, v7

    const/4 v10, 0x0

    const/4 v11, 0x1

    if-ltz v9, :cond_0

    move v9, v11

    goto :goto_0

    :cond_0
    move v9, v10

    :goto_0
    invoke-static {v9}, Lcom/google/android/gms/common/internal/Preconditions;->checkArgument(Z)V

    cmp-long v9, v3, v7

    if-ltz v9, :cond_1

    move v9, v11

    goto :goto_1

    :cond_1
    move v9, v10

    :goto_1
    invoke-static {v9}, Lcom/google/android/gms/common/internal/Preconditions;->checkArgument(Z)V

    cmp-long v9, v5, v7

    if-ltz v9, :cond_2

    move v10, v11

    :cond_2
    invoke-static {v10}, Lcom/google/android/gms/common/internal/Preconditions;->checkArgument(Z)V

    move-object v7, p1

    iput-object v7, v0, Lcom/google/android/gms/internal/measurement/zzes;->zzti:Ljava/lang/String;

    move-object v7, p2

    iput-object v7, v0, Lcom/google/android/gms/internal/measurement/zzes;->name:Ljava/lang/String;

    iput-wide v1, v0, Lcom/google/android/gms/internal/measurement/zzes;->zzafs:J

    iput-wide v3, v0, Lcom/google/android/gms/internal/measurement/zzes;->zzaft:J

    move-wide/from16 v1, p7

    iput-wide v1, v0, Lcom/google/android/gms/internal/measurement/zzes;->zzafu:J

    iput-wide v5, v0, Lcom/google/android/gms/internal/measurement/zzes;->zzafv:J

    move-object/from16 v1, p11

    iput-object v1, v0, Lcom/google/android/gms/internal/measurement/zzes;->zzafw:Ljava/lang/Long;

    move-object/from16 v1, p12

    iput-object v1, v0, Lcom/google/android/gms/internal/measurement/zzes;->zzafx:Ljava/lang/Long;

    move-object/from16 v1, p13

    iput-object v1, v0, Lcom/google/android/gms/internal/measurement/zzes;->zzafy:Ljava/lang/Boolean;

    return-void
.end method


# virtual methods
.method final zza(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;)Lcom/google/android/gms/internal/measurement/zzes;
    .locals 16

    move-object/from16 v0, p0

    if-eqz p3, :cond_0

    invoke-virtual/range {p3 .. p3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-nez v2, :cond_0

    const/4 v1, 0x0

    move-object v15, v1

    goto :goto_0

    :cond_0
    move-object/from16 v15, p3

    :goto_0
    new-instance v1, Lcom/google/android/gms/internal/measurement/zzes;

    iget-object v3, v0, Lcom/google/android/gms/internal/measurement/zzes;->zzti:Ljava/lang/String;

    iget-object v4, v0, Lcom/google/android/gms/internal/measurement/zzes;->name:Ljava/lang/String;

    iget-wide v5, v0, Lcom/google/android/gms/internal/measurement/zzes;->zzafs:J

    iget-wide v7, v0, Lcom/google/android/gms/internal/measurement/zzes;->zzaft:J

    iget-wide v9, v0, Lcom/google/android/gms/internal/measurement/zzes;->zzafu:J

    iget-wide v11, v0, Lcom/google/android/gms/internal/measurement/zzes;->zzafv:J

    move-object v2, v1

    move-object/from16 v13, p1

    move-object/from16 v14, p2

    invoke-direct/range {v2 .. v15}, Lcom/google/android/gms/internal/measurement/zzes;-><init>(Ljava/lang/String;Ljava/lang/String;JJJJLjava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;)V

    return-object v1
.end method

.method final zzac(J)Lcom/google/android/gms/internal/measurement/zzes;
    .locals 16

    move-object/from16 v0, p0

    new-instance v15, Lcom/google/android/gms/internal/measurement/zzes;

    iget-object v2, v0, Lcom/google/android/gms/internal/measurement/zzes;->zzti:Ljava/lang/String;

    iget-object v3, v0, Lcom/google/android/gms/internal/measurement/zzes;->name:Ljava/lang/String;

    iget-wide v4, v0, Lcom/google/android/gms/internal/measurement/zzes;->zzafs:J

    iget-wide v6, v0, Lcom/google/android/gms/internal/measurement/zzes;->zzaft:J

    iget-wide v10, v0, Lcom/google/android/gms/internal/measurement/zzes;->zzafv:J

    iget-object v12, v0, Lcom/google/android/gms/internal/measurement/zzes;->zzafw:Ljava/lang/Long;

    iget-object v13, v0, Lcom/google/android/gms/internal/measurement/zzes;->zzafx:Ljava/lang/Long;

    iget-object v14, v0, Lcom/google/android/gms/internal/measurement/zzes;->zzafy:Ljava/lang/Boolean;

    move-object v1, v15

    move-wide/from16 v8, p1

    invoke-direct/range {v1 .. v14}, Lcom/google/android/gms/internal/measurement/zzes;-><init>(Ljava/lang/String;Ljava/lang/String;JJJJLjava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;)V

    return-object v15
.end method

.method final zzad(J)Lcom/google/android/gms/internal/measurement/zzes;
    .locals 16

    move-object/from16 v0, p0

    new-instance v15, Lcom/google/android/gms/internal/measurement/zzes;

    iget-object v2, v0, Lcom/google/android/gms/internal/measurement/zzes;->zzti:Ljava/lang/String;

    iget-object v3, v0, Lcom/google/android/gms/internal/measurement/zzes;->name:Ljava/lang/String;

    iget-wide v4, v0, Lcom/google/android/gms/internal/measurement/zzes;->zzafs:J

    iget-wide v6, v0, Lcom/google/android/gms/internal/measurement/zzes;->zzaft:J

    iget-wide v8, v0, Lcom/google/android/gms/internal/measurement/zzes;->zzafu:J

    iget-object v12, v0, Lcom/google/android/gms/internal/measurement/zzes;->zzafw:Ljava/lang/Long;

    iget-object v13, v0, Lcom/google/android/gms/internal/measurement/zzes;->zzafx:Ljava/lang/Long;

    iget-object v14, v0, Lcom/google/android/gms/internal/measurement/zzes;->zzafy:Ljava/lang/Boolean;

    move-object v1, v15

    move-wide/from16 v10, p1

    invoke-direct/range {v1 .. v14}, Lcom/google/android/gms/internal/measurement/zzes;-><init>(Ljava/lang/String;Ljava/lang/String;JJJJLjava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;)V

    return-object v15
.end method

.method final zzii()Lcom/google/android/gms/internal/measurement/zzes;
    .locals 20

    move-object/from16 v0, p0

    new-instance v15, Lcom/google/android/gms/internal/measurement/zzes;

    iget-object v2, v0, Lcom/google/android/gms/internal/measurement/zzes;->zzti:Ljava/lang/String;

    iget-object v3, v0, Lcom/google/android/gms/internal/measurement/zzes;->name:Ljava/lang/String;

    iget-wide v4, v0, Lcom/google/android/gms/internal/measurement/zzes;->zzafs:J

    const-wide/16 v6, 0x1

    add-long v8, v4, v6

    iget-wide v4, v0, Lcom/google/android/gms/internal/measurement/zzes;->zzaft:J

    add-long v10, v4, v6

    iget-wide v12, v0, Lcom/google/android/gms/internal/measurement/zzes;->zzafu:J

    iget-wide v6, v0, Lcom/google/android/gms/internal/measurement/zzes;->zzafv:J

    iget-object v14, v0, Lcom/google/android/gms/internal/measurement/zzes;->zzafw:Ljava/lang/Long;

    iget-object v4, v0, Lcom/google/android/gms/internal/measurement/zzes;->zzafx:Ljava/lang/Long;

    iget-object v5, v0, Lcom/google/android/gms/internal/measurement/zzes;->zzafy:Ljava/lang/Boolean;

    move-object v1, v15

    move-object/from16 v16, v4

    move-object/from16 v17, v5

    move-wide v4, v8

    move-wide/from16 v18, v6

    move-wide v6, v10

    move-wide v8, v12

    move-wide/from16 v10, v18

    move-object v12, v14

    move-object/from16 v13, v16

    move-object/from16 v14, v17

    invoke-direct/range {v1 .. v14}, Lcom/google/android/gms/internal/measurement/zzes;-><init>(Ljava/lang/String;Ljava/lang/String;JJJJLjava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;)V

    return-object v15
.end method
